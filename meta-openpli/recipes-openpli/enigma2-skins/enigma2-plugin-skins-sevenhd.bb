SUMMARY = "Skin for Enigma2 (HD, FHD, UHD)"
MAINTAINER = "Team Kraven"
SECTION = "misc"
PRIORITY = "optional"
LICENSE = "CLOSED"
RDEPENDS_${PN} += "python-requests python-subprocess python-imaging enigma2-plugin-systemplugins-mphelp python-lxml"

inherit gitpkgv allarch
SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"

SRC_URI= "git://github.com/KravenHD/SevenHD.git;protocol=https;"

S = "${WORKDIR}/git"

FILES_${PN} = "/usr/*"

do_compile() {
}

do_install() {
    cp -r --preserve=mode,links ${S}/data/usr ${D}/
}

do_postrm_append() {
#!/bin/sh
rm -rf /usr/share/enigma2/SevenHD
rm -rf /usr/lib/enigma2/python/Plugins/Extensions/SevenHD
rm -rf /usr/lib/enigma2/python/Components/Converter/SevenHD*
rm -rf /usr/lib/enigma2/python/Components/Renderer/SevenHD*
echo "                                                          "
echo "              ...Skin successful removed.                 "
echo "                                                          "
}
