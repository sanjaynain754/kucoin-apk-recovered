package com.kubi.sdk.web.listener.dispatch;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.sdk.web.core.WebCoreException;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ListenerDispatcher.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u0014*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\t\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b\u000f\u0010\nJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0004R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0015j\b\u0012\u0004\u0012\u00028\u0000`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/sdk/web/listener/dispatch/ListenerDispatcher;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "e", "(Lkotlin/jvm/functions/Function1;)V", "", "d", "()Ljava/util/List;", "", "c", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)V", "f", "b", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "listeners", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nListenerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListenerDispatcher.kt\ncom/kubi/sdk/web/listener/dispatch/ListenerDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n*L\n1#1,59:1\n1855#2:60\n1856#2:64\n1747#2,2:65\n1749#2:70\n86#3,3:61\n86#3,3:67\n*S KotlinDebug\n*F\n+ 1 ListenerDispatcher.kt\ncom/kubi/sdk/web/listener/dispatch/ListenerDispatcher\n*L\n16#1:60\n16#1:64\n32#1:65,2\n32#1:70\n20#1:61,3\n36#1:67,3\n*E\n"})
public final class ListenerDispatcher<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final LinkedHashSet<T> listeners = new LinkedHashSet<>();

    /* JADX INFO: renamed from: a */
    public final void m58770a(T listener) {
        synchronized (this.listeners) {
            this.listeners.add(listener);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m58771b() {
        synchronized (this.listeners) {
            this.listeners.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m58772c(@NotNull Function1<? super T, Boolean> action) {
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(action, "action");
        List<T> listM58773d = m58773d();
        if (listM58773d == null || !listM58773d.isEmpty()) {
            Iterator<T> it = listM58773d.iterator();
            while (it.hasNext()) {
                try {
                    zBooleanValue = action.invoke(it.next()).booleanValue();
                } catch (Exception e11) {
                    C43846g.m96568c(new WebCoreException(e11, "ListenerDispatcher", false, "ListenerDispatcher err", 4, null), null, 2, null);
                    zBooleanValue = false;
                }
                if (zBooleanValue) {
                    return;
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<T> m58773d() {
        List<T> list;
        synchronized (this.listeners) {
            list = CollectionsKt.toList(this.listeners);
        }
        return list;
    }

    /* JADX INFO: renamed from: e */
    public final void m58774e(@NotNull Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator<T> it = m58773d().iterator();
        while (it.hasNext()) {
            try {
                action.invoke(it.next());
            } catch (Exception e11) {
                C43846g.m96568c(new WebCoreException(e11, "ListenerDispatcher", false, "ListenerDispatcher err", 4, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m58775f(T listener) {
        synchronized (this.listeners) {
            this.listeners.remove(listener);
        }
    }
}
