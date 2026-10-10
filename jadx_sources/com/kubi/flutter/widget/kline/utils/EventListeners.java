package com.kubi.flutter.widget.kline.utils;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.flutter.widget.kline.utils.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: EventListeners.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\u0006\u0010\f\u001a\u00020\bJ'\u0010\r\u001a\u00020\b2\u0019\b\u0004\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010H\u0086\bø\u0001\u0000JC\u0010\u0011\u001a\u0004\u0018\u0001H\u0012\"\u0004\b\u0001\u0010\u00122+\b\u0004\u0010\u000e\u001a%\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00120\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013¢\u0006\u0002\b\u0010H\u0086H¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/utils/EventListeners;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "eventListeners", "", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Ljava/lang/Object;)V", "removeListener", "clear", "callListener", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "callOne", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEventListeners.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventListeners.kt\ncom/kubi/flutter/widget/kline/utils/EventListeners\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KLineIssue.kt\ncom/kubi/flutter/widget/kline/exception/KLineIssueKt\n*L\n1#1,51:1\n1869#2:52\n1870#2:57\n45#3,4:53\n*S KotlinDebug\n*F\n+ 1 EventListeners.kt\ncom/kubi/flutter/widget/kline/utils/EventListeners\n*L\n36#1:52\n36#1:57\n40#1:53,4\n*E\n"})
public final class EventListeners<T> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Set<T> f22493a = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    public final void m24390b(T t11) {
        synchronized (this.f22493a) {
            this.f22493a.add(t11);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m24391c() {
        synchronized (this.f22493a) {
            this.f22493a.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m24392d(T t11) {
        synchronized (this.f22493a) {
            this.f22493a.remove(t11);
        }
    }
}
