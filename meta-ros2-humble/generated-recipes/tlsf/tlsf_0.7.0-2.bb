# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "TLSF allocator version 2.4.6"
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
ROS_AUTHOR = "Jackie Kay <jackie@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "GNU Lesser Public License 2.1"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3badeab1074cb0c993003745c15d12f0"

ROS_CN = "tlsf"
ROS_BPN = "tlsf"

ROS_BUILD_DEPENDS = " \
    ament-cmake \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-cmake \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/tlsf-release/archive/release/humble/tlsf/0.7.0-2.tar.gz
ROS_BRANCH ?= "branch=release/humble/tlsf"
SRC_URI = "git://github.com/ros2-gbp/tlsf-release;${ROS_BRANCH};protocol=https"
SRCREV = "77ce2b324b10579e8c09875b3da7de51811693ef"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
