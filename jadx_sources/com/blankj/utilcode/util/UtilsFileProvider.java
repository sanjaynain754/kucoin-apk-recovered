package com.blankj.utilcode.util;

import android.app.Application;
import androidx.core.content.FileProvider;

/* JADX INFO: loaded from: classes.dex */
public class UtilsFileProvider extends FileProvider {
    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public boolean onCreate() {
        C5287o0.m6332b((Application) getContext().getApplicationContext());
        return true;
    }
}
