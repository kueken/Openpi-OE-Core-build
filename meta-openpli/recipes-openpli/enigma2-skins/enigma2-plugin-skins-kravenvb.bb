SUMMARY = "Skin for Enigma2"
MAINTAINER = "Team Kraven"
SECTION = "misc"
PRIORITY = "optional"
LICENSE = "CLOSED"
RDEPENDS_${PN} += "python-imaging python-subprocess python-requests python-xml enigma2-plugin-systemplugins-mphelp"

inherit gitpkgv allarch
SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"

SRC_URI= "git://github.com/KravenHD/KravenVB.git;protocol=https; file://pli.png"

S = "${WORKDIR}/git"

FILES_${PN} = "/usr/* /etc/*"

do_compile() {
}

do_install() {
    cp -r --preserve=mode,links ${S}/usr ${D}/
    cp -r --preserve=mode,links ${S}/etc ${D}/
    install -m 0644 ${WORKDIR}/pli.png ${D}/usr/share/enigma2/KravenVB/
}

do_postrm_append() {
#!/bin/sh
rm -rf /usr/share/enigma2/KravenVB
rm -rf /usr/lib/enigma2/python/Plugins/Extensions/KravenVB
rm -rf /usr/lib/enigma2/python/Components/Converter/KravenVB*
rm -rf /usr/lib/enigma2/python/Components/Renderer/KravenVB*
echo "                                                          "
echo "              ...Skin successful removed.                 "
echo "                                                          "
}
