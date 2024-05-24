# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "The spatio-temporal 3D obstacle costmap package"
AUTHOR = "Steve Macenski <stevenmacenski@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "LGPL v2.1"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=51cb7c4da723adcc172e438a5d750382"

ROS_CN = "spatio_temporal_voxel_layer"
ROS_BPN = "spatio_temporal_voxel_layer"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenexr-dev} \
    builtin-interfaces \
    geometry-msgs \
    laser-geometry \
    message-filters \
    nav2-costmap-2d \
    openvdb-vendor \
    pcl \
    pcl-conversions \
    pluginlib \
    rclcpp \
    rosidl-default-generators \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenexr-dev} \
    builtin-interfaces \
    geometry-msgs \
    laser-geometry \
    message-filters \
    nav2-costmap-2d \
    openvdb-vendor \
    pcl \
    pcl-conversions \
    pluginlib \
    rclcpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenexr-dev} \
    builtin-interfaces \
    geometry-msgs \
    laser-geometry \
    message-filters \
    nav2-costmap-2d \
    openvdb-vendor \
    pcl \
    pcl-conversions \
    pluginlib \
    rclcpp \
    rosidl-default-runtime \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SteveMacenski/spatio_temporal_voxel_layer-release/archive/release/iron/spatio_temporal_voxel_layer/2.4.0-1.tar.gz
ROS_BRANCH ?= "branch=release/iron/spatio_temporal_voxel_layer"
SRC_URI = "git://github.com/SteveMacenski/spatio_temporal_voxel_layer-release;${ROS_BRANCH};protocol=https"
SRCREV = "158b858466036ebd212a7192c0def3803d20730c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
