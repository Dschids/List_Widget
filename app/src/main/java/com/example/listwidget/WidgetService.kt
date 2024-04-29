package com.example.listwidget

import android.content.Intent
import android.widget.RemoteViewsService

class WidgetService : RemoteViewsService() {
    override fun onGetViewFactory(intent: Intent):
            RemoteViewsFactory {
        return DataProvider(this, intent)
    }
}