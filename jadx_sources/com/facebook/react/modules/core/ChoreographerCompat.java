package com.facebook.react.modules.core;

import android.view.Choreographer;
import com.tencent.bugly.proguard.C33690hb;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ChoreographerCompat.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/facebook/react/modules/core/ChoreographerCompat;", "", "<init>", "()V", C33690hb.f70090u, "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class ChoreographerCompat {

    /* JADX INFO: compiled from: ChoreographerCompat.kt */
    @Deprecated(message = "Use Choreographer.FrameCallback instead")
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;", "Landroid/view/Choreographer$FrameCallback;", "<init>", "()V", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static abstract class FrameCallback implements Choreographer.FrameCallback {
    }
}
