# Copyright (c) 2020-2021 LG Electronics, Inc.

ROS_BUILD_DEPENDS_remove = "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'connext', 'rmw-connext-cpp rmw-connextdds', '', d)}"

ROS_BUILD_DEPENDS_append = "rosidl-adapter-native"
ROS_EXEC_DEPENDS_append = " \
    rmw-fastrtps-cpp \
    rmw-cyclonedds-cpp \
"
