package com.kubi.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.Predicate;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.utils.a0 */
/* JADX INFO: compiled from: ObservableLast.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0004R\"\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/utils/a0;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/reactivex/functions/Predicate;", "<init>", "()V", "Lkotlin/Function0;", "", TUIConstants.TUIChat.CALL_BACK, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/jvm/functions/Function0;)V", "c", "b", "", "Ljava/util/Set;", "callbacks", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nObservableLast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObservableLast.kt\ncom/kubi/utils/LastPredicate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n1855#2,2:127\n*S KotlinDebug\n*F\n+ 1 ObservableLast.kt\ncom/kubi/utils/LastPredicate\n*L\n106#1:127,2\n*E\n"})
public abstract class AbstractC27013a0<T> implements Predicate<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Set<Function0<Unit>> callbacks = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public final synchronized void m66498a(@NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbacks.add(callback);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m66499b() {
        Iterator<T> it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m66500c(@NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbacks.remove(callback);
    }
}
