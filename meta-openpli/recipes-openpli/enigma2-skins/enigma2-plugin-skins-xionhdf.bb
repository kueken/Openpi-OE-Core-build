SUMMARY = "Skin for HDF Images"
MAINTAINER = "Team Kraven"
SECTION = "misc"
PRIORITY = "optional"
LICENSE = "CLOSED"
RDEPENDS_${PN} += "python-requests"

inherit gitpkgv allarch
SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"

SRC_URI= "git://github.com/KravenHD/XionHDF.git;protocol=https; file://pli.png"

S = "${WORKDIR}/git"

FILES_${PN} = "/usr/*"

do_compile() {
}

do_install() {
    cp -r --preserve=mode,links ${S}/usr ${D}/
    install -m 0644 ${WORKDIR}/pli.png ${D}/usr/share/enigma2/XionHDF/
}

do_postrm_append() {
#!/bin/sh
rm -rf /usr/share/enigma2/XionHDF
rm -rf /usr/lib/enigma2/python/Plugins/Extensions/XionHDF
rm -rf /usr/lib/enigma2/python/Components/Converter/XionHDF*
rm -rf /usr/lib/enigma2/python/Components/Renderer/XionHDF*
echo "                                                          "
echo "              ...Skin successful removed.                 "
echo "                                                          "
}
