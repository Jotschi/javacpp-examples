LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := opengltest

LOCAL_CFLAGS := -DANDROID_NDK 

LOCAL_SRC_FILES := opengltest.c

LOCAL_LDLIBS := -lGLESv2 -llog

include $(BUILD_SHARED_LIBRARY)

