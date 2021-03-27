GST_VERSION_FULL = "1.18.4"

inherit gitpkgv meson gettext

PV = "${GST_VERSION_FULL}+git${SRCPV}"
PKGV = "${GST_VERSION_FULL}+git${GITPKGV}"

SRCREV_gst = "eacb7aa8d12f66a3ff1970c149210972f6079b56"
SRCREV_gst_libav = "e896aabe3c3d278510fb567712c4a55ed0eae075"

SRCREV_gst_plugins_bad = "c0c804384ca29fecd8329de0745693ed11784b81"
SRCREV_gst_plugins_base = "64fa797ce57237ec4f527e1746a2067cfa05937d"
SRCREV_gst_plugins_good = "b80518152799385fc31ac8fce086541ff1b97812"
SRCREV_gst_plugins_ugly = "bb3f9de20025820fb1c913f96e31cf0a27528bcc"

S = "${WORKDIR}/git"
