package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.KotlinDetector;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    private static final String ANDROID_INSTALLER = "android-installer";
    private static final String ANDROID_PLATFORM = "android-platform";
    private static final String DEVICE_BRAND = "device-brand";
    private static final String DEVICE_MODEL = "device-model";
    private static final String DEVICE_NAME = "device-name";
    private static final String FIREBASE_ANDROID = "fire-android";
    private static final String FIREBASE_COMMON = "fire-core";
    private static final String KOTLIN = "kotlin";
    private static final String MIN_SDK = "android-min-sdk";
    private static final String TARGET_SDK = "android-target-sdk";

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m13701d(Context context) {
        int i11 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return (i11 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    private static String safeValue(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DefaultUserAgentPublisher.component());
        arrayList.add(DefaultHeartBeatController.component());
        arrayList.add(LibraryVersionComponent.create(FIREBASE_ANDROID, String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(LibraryVersionComponent.create(FIREBASE_COMMON, BuildConfig.VERSION_NAME));
        arrayList.add(LibraryVersionComponent.create(DEVICE_NAME, safeValue(Build.PRODUCT)));
        arrayList.add(LibraryVersionComponent.create(DEVICE_MODEL, safeValue(Build.DEVICE)));
        arrayList.add(LibraryVersionComponent.create(DEVICE_BRAND, safeValue(Build.BRAND)));
        arrayList.add(LibraryVersionComponent.fromContext(TARGET_SDK, new LibraryVersionComponent.VersionExtractor() { // from class: com.google.firebase.c
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.m13700c((Context) obj);
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext(MIN_SDK, new LibraryVersionComponent.VersionExtractor() { // from class: com.google.firebase.d
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.m13699b((Context) obj);
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext(ANDROID_PLATFORM, new LibraryVersionComponent.VersionExtractor() { // from class: com.google.firebase.e
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.m13701d((Context) obj);
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext(ANDROID_INSTALLER, new LibraryVersionComponent.VersionExtractor() { // from class: com.google.firebase.f
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.m13698a((Context) obj);
            }
        }));
        String strDetectVersion = KotlinDetector.detectVersion();
        if (strDetectVersion != null) {
            arrayList.add(LibraryVersionComponent.create(KOTLIN, strDetectVersion));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m13698a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return safeValue(installerPackageName);
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m13699b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.minSdkVersion);
        }
        return "";
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m13700c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }
}
