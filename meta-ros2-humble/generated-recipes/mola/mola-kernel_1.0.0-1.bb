# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Fundamental C++ virtual interfaces and data types for the rest of MOLA modules"
AUTHOR = "Jose-Luis Blanco-Claraco <joseluisblancoc@gmail.com>"
ROS_AUTHOR = "Jose-Luis Blanco-Claraco <joseluisblancoc@gmail.com>"
HOMEPAGE = "https://github.com/MOLAorg/"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "GPLv3"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=e9f2deaa804a16d9e0d3965ef77e171e"

ROS_CN = "mola"
ROS_BPN = "mola_kernel"

ROS_BUILD_DEPENDS = " \
    mola-common \
    mola-yaml \
    mrpt2 \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    mola-common \
    mola-yaml \
    mrpt2 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    mola-common \
    mola-yaml \
    mrpt2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/mola-release/archive/release/humble/mola_kernel/1.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/mola_kernel"
SRC_URI = "git://github.com/ros2-gbp/mola-release;${ROS_BRANCH};protocol=https"
SRCREV = "4253514df067f7990ce43a6c6adc8f7ba46ef05e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
