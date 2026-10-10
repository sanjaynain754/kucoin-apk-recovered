package com.kubi.sdk.flutter.delegate;

import android.os.Build;
import io.flutter.embedding.engine.FlutterShellArgs;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.flutter.delegate.n, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FlutterShellArgsHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007¨\u0006\t"}, m90084d2 = {"Lcom/kubi/sdk/flutter/delegate/FlutterShellArgsHelper;", "", "<init>", "()V", "getShellArgs", "", "", "()[Ljava/lang/String;", "getShellArgsOrNull", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutterShellArgsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterShellArgsHelper.kt\ncom/kubi/sdk/flutter/delegate/FlutterShellArgsHelper\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,34:1\n37#2:35\n36#2,3:36\n*S KotlinDebug\n*F\n+ 1 FlutterShellArgsHelper.kt\ncom/kubi/sdk/flutter/delegate/FlutterShellArgsHelper\n*L\n22#1:35\n22#1:36,3\n*E\n"})
public final class FlutterShellArgsHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FlutterShellArgsHelper f46683a = new FlutterShellArgsHelper();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String[] m56820a() {
        ArrayList arrayList = new ArrayList();
        FlutterImpellerConfig flutterImpellerConfig = FlutterImpellerConfig.f46678a;
        if (flutterImpellerConfig.m56819f()) {
            arrayList.add(FlutterShellArgs.ARG_DISABLE_IMPELLER);
        }
        if (flutterImpellerConfig.m56818e() && Build.VERSION.SDK_INT == 27) {
            CollectionsKt.addAll(arrayList, CollectionsKt.listOf((Object[]) new String[]{"--disable-dart-asserts", "--no-enable-mmap-snapshot"}));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String[] m56821b() {
        String[] strArrM56820a = m56820a();
        if (strArrM56820a.length == 0) {
            return null;
        }
        return strArrM56820a;
    }
}
