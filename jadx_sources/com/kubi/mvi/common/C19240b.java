package com.kubi.mvi.common;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.p110rn.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.mvi.common.b */
/* JADX INFO: compiled from: FirebaseEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aZ\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"", "trackName", Constants.BIZ, "", "needTrack", "logTag", "needLog", "Lkotlin/Function1;", "Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "MVI_release"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFirebaseEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseEx.kt\ncom/kubi/mvi/common/FirebaseExKt\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,64:1\n167#2,2:65\n167#2,4:67\n170#2:71\n*S KotlinDebug\n*F\n+ 1 FirebaseEx.kt\ncom/kubi/mvi/common/FirebaseExKt\n*L\n22#1:65,2\n24#1:67,4\n22#1:71\n*E\n"})
public final class C19240b {
    /* JADX INFO: renamed from: a */
    public static final void m42526a(@NotNull String trackName, @NotNull String biz, boolean z11, @Nullable String str, boolean z12, @NotNull Function1<? super TechnologyEvent.EventParametersBuilder, Unit> block) throws JSONException {
        Intrinsics.checkNotNullParameter(trackName, "trackName");
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(block, "block");
        if (z11) {
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
            if (biz.length() > 0) {
                eventParametersBuilderAcquire.m42393d(Constants.BIZ, biz);
            }
            block.invoke(eventParametersBuilderAcquire);
            TechnologyEvent.m42388d(trackName, eventParametersBuilderAcquire);
            MviExKt.m42520p(eventParametersBuilderAcquire, z12, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m42527b(String str, String str2, boolean z11, String str3, boolean z12, Function1 function1, int i11, Object obj) throws JSONException {
        if ((i11 & 1) != 0) {
            str = "firebase-track";
        }
        if ((i11 & 2) != 0) {
            str2 = "mvi";
        }
        if ((i11 & 4) != 0) {
            z11 = MviExKt.m42517m();
        }
        if ((i11 & 8) != 0) {
            str3 = "firebase-track";
        }
        if ((i11 & 16) != 0) {
            z12 = MviExKt.m42517m();
        }
        m42526a(str, str2, z11, str3, z12, function1);
    }
}
