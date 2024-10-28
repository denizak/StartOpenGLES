package com.example.startopengles

import android.content.Context
import android.opengl.GLSurfaceView

class StartGLView(context: Context) : GLSurfaceView(context) {

    private val renderer: StartGLRenderer

    init {

        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2)

        renderer = StartGLRenderer()

        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(renderer)

        renderMode = GLSurfaceView.RENDERMODE_WHEN_DIRTY
    }
}