LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := opengltest

LOCAL_CFLAGS := -DANDROID_NDK 

LOCAL_SRC_FILES := opengltest.cpp 

LOCAL_LDLIBS := -lGLESv1_CM -ldl -llog

include $(BUILD_SHARED_LIBRARY)
