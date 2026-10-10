package com.kubi.sdk.web.listener.dispatch;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.sdk.web.core.WebCoreException;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: WeakListenerDispatcher.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\t\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/sdk/web/listener/dispatch/WeakListenerDispatcher;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "c", "(Lkotlin/jvm/functions/Function1;)V", "", "b", "()Ljava/util/List;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)V", "", "d", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "lock", "", "Ljava/lang/ref/WeakReference;", "Ljava/util/List;", "weakListeners", "listeners", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWeakListenerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakListenerDispatcher.kt\ncom/kubi/sdk/web/listener/dispatch/WeakListenerDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n*L\n1#1,94:1\n1855#2:95\n1856#2:99\n1747#2,2:100\n1749#2:105\n86#3,3:96\n86#3,3:102\n*S KotlinDebug\n*F\n+ 1 WeakListenerDispatcher.kt\ncom/kubi/sdk/web/listener/dispatch/WeakListenerDispatcher\n*L\n19#1:95\n19#1:99\n29#1:100,2\n29#1:105\n23#1:96,3\n33#1:102,3\n*E\n"})
public final class WeakListenerDispatcher<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<WeakReference<T>> weakListeners = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<T> listeners = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m58776a(T listener) {
        synchronized (this.lock) {
            this.weakListeners.add(new WeakReference<>(listener));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<T> m58777b() {
        ArrayList arrayList;
        synchronized (this.lock) {
            try {
                arrayList = new ArrayList(this.weakListeners.size() + this.listeners.size());
                Iterator<WeakReference<T>> it = this.weakListeners.iterator();
                while (it.hasNext()) {
                    T t11 = it.next().get();
                    if (t11 != null) {
                        arrayList.add(t11);
                    } else {
                        it.remove();
                    }
                }
                arrayList.addAll(this.listeners);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final void m58778c(@NotNull Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator<T> it = m58777b().iterator();
        while (it.hasNext()) {
            try {
                action.invoke(it.next());
            } catch (Exception e11) {
                C43846g.m96568c(new WebCoreException(e11, "WeakListenerDispatcher", false, "ListenerDispatcher err", 4, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m58779d(T listener) {
        synchronized (this.lock) {
            try {
                if (this.listeners.remove(listener)) {
                    return true;
                }
                Iterator<WeakReference<T>> it = this.weakListeners.iterator();
                boolean z11 = false;
                while (it.hasNext()) {
                    T t11 = it.next().get();
                    if (t11 == null) {
                        it.remove();
                    } else if (Intrinsics.areEqual(listener, t11)) {
                        it.remove();
                        z11 = true;
                    }
                }
                return z11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
