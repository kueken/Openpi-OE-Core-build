SUMMARY = "Backport of functools.lru_cache from Python 3.3"
HOMEPAGE = "https://github.com/jaraco/backports.functools_lru_cache"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

PYPI_PACKAGE = "backports.functools_lru_cache"

SRC_URI[md5sum] = "8fed424f30bf9554235aa02997b7574c"
SRC_URI[sha256sum] = "d5ed2169378b67d3c545e5600d363a923b09c456dab1593914935a68ad478271"

DEPENDS += "python-setuptools-scm-native"

inherit setuptools pypi

RDEPENDS_${PN} += "\
    python-pkgutil \
    python-pickle \
    python-threading \
    "

do_install_append() {
    # python-lzma already provides __init__.py(o) files
    rm -rf ${D}${libdir}/${PYTHON_DIR}/site-packages/backports/__init__.py*
}