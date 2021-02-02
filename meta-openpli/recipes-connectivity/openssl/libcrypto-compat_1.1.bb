SUMMARY = "Compatibility for packages that link to older libcrypto or libssl"

require conf/license/license-gplv2.inc

RDEPENDS_${PN} = "libcrypto libssl libxcrypt-compat"

RREPLACES_${PN} = "libcrypto1.0.0 libssl1.0.0 libcrypto0.9.8 libssl0.9.8 libcrypto0.9.7 libssl0.9.7"
RCONFLICTS_${PN} = "libcrypto1.0.0 libssl1.0.0 libcrypto0.9.8 libssl0.9.8 libcrypto0.9.7 libssl0.9.7"

do_install () {
    install -d ${D}${libdir}
    ln -sf libcrypto.so.1.1 ${D}${libdir}/libcrypto.so.0.9.7
    ln -sf libssl.so.1.1 ${D}${libdir}/libssl.so.0.9.7
    ln -sf libcrypto.so.1.1 ${D}${libdir}/libcrypto.so.0.9.8
    ln -sf libssl.so.1.1 ${D}${libdir}/libssl.so.0.9.8
    ln -sf libcrypto.so.1.1 ${D}${libdir}/libcrypto.so.1.0.0
    ln -sf libssl.so.1.1 ${D}${libdir}/libssl.so.1.0.0
}

FILES_${PN} = "${libdir}"

RPROVIDES_${PN} += "libcrypto1.0.0 libssl1.0.0 libcrypto0.9.8 libssl0.9.8 libcrypto0.9.7 libssl0.9.7"
