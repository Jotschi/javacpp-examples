#ifdef __cplusplus
extern "C" {
#endif


#include "opengltest.h"
#include <android/log.h>
#include <GLES2/gl2.h>
#include <GLES2/gl2ext.h>


void setColor() {
	__android_log_print(ANDROID_LOG_INFO, "OpenGLTest", "Test");
	glClearColor(0,1,1,0);
}

#ifdef __cplusplus
}
#endif
