# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Vendor library for SDL2."
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "joystick_drivers"
ROS_BPN = "sdl2_vendor"

ROS_BUILD_DEPENDS = " \
    libsdl2 \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    libsdl2 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libsdl2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/joystick_drivers-release/archive/release/foxy/sdl2_vendor/2.4.1-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/sdl2_vendor"
SRC_URI = "git://github.com/ros2-gbp/joystick_drivers-release;${ROS_BRANCH};protocol=https"
SRCREV = "91503d1a234a4611c7768c60c1b8b9ad6f3e08ce"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
