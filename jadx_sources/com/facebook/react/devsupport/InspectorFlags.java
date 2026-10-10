package com.facebook.react.devsupport;

import org.jetbrains.annotations.NotNull;
import p633t6.InterfaceC44695a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: InspectorFlags.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0087 ¨\u0006\u0006"}, m90084d2 = {"Lcom/facebook/react/devsupport/InspectorFlags;", "", "<init>", "()V", "getFuseboxEnabled", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@InterfaceC44695a
public final class InspectorFlags {

    @NotNull
    public static final InspectorFlags INSTANCE = new InspectorFlags();

    @JvmStatic
    @InterfaceC44695a
    public static final native boolean getFuseboxEnabled();

    static {
        DevSupportSoLoader.staticInit();
    }

    private InspectorFlags() {
    }
}
