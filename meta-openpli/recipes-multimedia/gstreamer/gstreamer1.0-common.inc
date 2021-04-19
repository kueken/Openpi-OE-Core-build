GST_VERSION_FULL = "1.18.4"

inherit gitpkgv meson gettext

PV = "${GST_VERSION_FULL}+git${SRCPV}"
PKGV = "${GST_VERSION_FULL}+git${GITPKGV}"

SRCREV_gst = "b566cbe0222439aad0c67b39161e6ffdd3747ebe"
SRCREV_gst_libav = "801dc93b790e9a96aa437a3f344214170c0bd540"

SRCREV_gst_plugins_bad = "c4321ee4a82c9d3426675de13f2c20c9a1d35e30"
SRCREV_gst_plugins_base = "da03e3ad200f7df0762ad12130b17f41998267f1"
SRCREV_gst_plugins_good = "b59191319bb126f95ea3fca381f2646fbe6304c7"
SRCREV_gst_plugins_ugly = "3d9799b41e5f1148f1dadd8ca9e568f1706b35cc"

S = "${WORKDIR}/git"
