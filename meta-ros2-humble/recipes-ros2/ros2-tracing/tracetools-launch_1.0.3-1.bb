# Generated by superflore -- DO NOT EDIT
# Generated from manually modified cache.yaml, because superflore doesn't support fetching from gitlab.com (only from github.com)
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Launch integration for tracing."
AUTHOR = "Christophe Bedard <bedard.christophe@gmail.com>"
ROS_AUTHOR = "Christophe Bedard <fixed-term.christophe.bourquebedard@de.bosch.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "ros2_tracing"
ROS_BPN = "tracetools_launch"

ROS_BUILD_DEPENDS = " \
    launch \
    launch-ros \
    tracetools-trace \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    launch \
    launch-ros \
    tracetools-trace \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    launch \
    launch-ros \
    tracetools-trace \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-mypy \
    ament-pep257 \
    ament-xmllint \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://gitlab.com/ros_tracing/ros2_tracing-release/archive/release/rolling/tracetools_launch/1.0.3-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/tracetools_launch"
SRC_URI = "git://gitlab.com/ros_tracing/ros2_tracing-release;${ROS_BRANCH};protocol=https"
SRCREV = "6fffe7751c2f225c446b958694f11c0b4577649a"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}