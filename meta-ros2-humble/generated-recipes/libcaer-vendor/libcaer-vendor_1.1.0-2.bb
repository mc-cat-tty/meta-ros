# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Wrapper around libcaer library"
AUTHOR = "Bernd Pfrommer <bernd.pfrommer@gmail.com>"
ROS_AUTHOR = "Bernd Pfrommer <bernd.pfrommer@gmail.com>"
HOMEPAGE = "https://gitlab.com/inivation/dv/libcaer"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0 & BSD-2"
LICENSE = "Apache-2.0 & BSD-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=7fe17132d4ce9672ce7d4db0f8911813"

ROS_CN = "libcaer_vendor"
ROS_BPN = "libcaer_vendor"

ROS_BUILD_DEPENDS = " \
    cmake \
    libusb1 \
    pkgconfig \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-vendor-package-native \
"

ROS_EXPORT_DEPENDS = " \
    libusb1 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libusb1 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/libcaer_vendor-release/archive/release/humble/libcaer_vendor/1.1.0-2.tar.gz
ROS_BRANCH ?= "branch=release/humble/libcaer_vendor"
SRC_URI = "git://github.com/ros2-gbp/libcaer_vendor-release;${ROS_BRANCH};protocol=https"
SRCREV = "e68ce003771bab845613587f9daba941a88fe237"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
