GST_VERSION_FULL = "1.18.4"

inherit gitpkgv meson gettext

PV = "${GST_VERSION_FULL}+git${SRCPV}"
PKGV = "${GST_VERSION_FULL}+git${GITPKGV}"

SRCREV_gst = "0d1fad0e92b44fdd95f9cd2f48932c4734d70363"
SRCREV_gst_libav = "0d9554d95b08d54a3ae126bb0a6189dfa708cf7e"

SRCREV_gst_plugins_bad = "814bc2e5e4f486d57aa7b46057ef285419919e2b"
SRCREV_gst_plugins_base = "90903917a8185e0f9add7af8153ae2fc9875fdcb"
SRCREV_gst_plugins_good = "9155b21a552c2894561ebf11dc1bf5e42848c552"
SRCREV_gst_plugins_ugly = "b9b5c66e7842757720d7ca79005eb56e8cea453d"

S = "${WORKDIR}/git"
