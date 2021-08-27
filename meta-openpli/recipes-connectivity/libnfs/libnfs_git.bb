SUMMARY = "NFS client library"

LICENSE = "LGPLv2.1 & GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=825301ba17efc9d188ee0abd4b924ada"

PV = "4.0.0+git"
SRCREV = "820dc73e328e8b0ff62573b218824c2aca2cb2e1"

SRC_URI = "git://github.com/sahlberg/libnfs.git;protocol=https"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = "-DBASE_LIB_PATH=${baselib}"
