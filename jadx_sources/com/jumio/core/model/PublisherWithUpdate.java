package com.jumio.core.model;

import com.google.firebase.messaging.Constants;
import com.jumio.core.scope.ScopeProviderInterface;
import com.jumio.core.util.ReflectionUtil;
import java.lang.reflect.Method;
import java.util.concurrent.CopyOnWriteArrayList;
import jumio.core.C40640b3;
import jumio.core.C40646c3;
import jumio.core.C40651d3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nJ\u001a\u0010\u0012\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nJ\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0004R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/jumio/core/model/PublisherWithUpdate;", "Update", "", "Result", "scopeProvider", "Lcom/jumio/core/scope/ScopeProviderInterface;", "<init>", "(Lcom/jumio/core/scope/ScopeProviderInterface;)V", "subscribers", "", "Lcom/jumio/core/model/SubscriberWithUpdate;", "publishUpdate", "", "update", "(Ljava/lang/Object;)V", "subscribe", "", "subscriber", "unsubscribe", "publishResult", "data", "publishError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPublisherWithUpdate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PublisherWithUpdate.kt\ncom/jumio/core/model/PublisherWithUpdate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
public abstract class PublisherWithUpdate<Update, Result> {

    /* JADX INFO: renamed from: a */
    public final ScopeProviderInterface f14161a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f14162b;

    public PublisherWithUpdate(@NotNull ScopeProviderInterface scopeProvider) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f14161a = scopeProvider;
        this.f14162b = new CopyOnWriteArrayList();
    }

    public final void publishError(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        for (SubscriberWithUpdate subscriberWithUpdate : this.f14162b) {
            try {
                Method method = ReflectionUtil.INSTANCE.getMethod(subscriberWithUpdate, "onError", error.getClass());
                InvokeOnUiThread invokeOnUiThread = method != null ? (InvokeOnUiThread) method.getAnnotation(InvokeOnUiThread.class) : null;
                if (invokeOnUiThread == null || !invokeOnUiThread.value()) {
                    subscriberWithUpdate.onError(error);
                } else {
                    this.f14161a.postOnMain(new C40640b3(subscriberWithUpdate, error, null));
                }
            } catch (NoSuchMethodException unused) {
                subscriberWithUpdate.onError(error);
            }
        }
    }

    public void publishResult(@Nullable Result data) {
        Class<?> cls;
        for (SubscriberWithUpdate subscriberWithUpdate : this.f14162b) {
            if (data != null) {
                try {
                    cls = data.getClass();
                } catch (NoSuchMethodException unused) {
                    subscriberWithUpdate.onResult(data);
                }
            } else {
                cls = null;
            }
            Method method = ReflectionUtil.INSTANCE.getMethod(subscriberWithUpdate, "onResult", cls);
            InvokeOnUiThread invokeOnUiThread = method != null ? (InvokeOnUiThread) method.getAnnotation(InvokeOnUiThread.class) : null;
            if (invokeOnUiThread == null || !invokeOnUiThread.value()) {
                subscriberWithUpdate.onResult(data);
            } else {
                this.f14161a.postOnMain(new C40646c3(subscriberWithUpdate, data, null));
            }
        }
    }

    public void publishUpdate(@NotNull Update update) {
        Intrinsics.checkNotNullParameter(update, "update");
        for (SubscriberWithUpdate subscriberWithUpdate : this.f14162b) {
            try {
                Method method = ReflectionUtil.INSTANCE.getMethod(subscriberWithUpdate, "onUpdate", update.getClass());
                InvokeOnUiThread invokeOnUiThread = method != null ? (InvokeOnUiThread) method.getAnnotation(InvokeOnUiThread.class) : null;
                if (invokeOnUiThread == null || !invokeOnUiThread.value()) {
                    subscriberWithUpdate.onUpdate(update);
                } else {
                    this.f14161a.postOnMain(new C40651d3(subscriberWithUpdate, update, null));
                }
            } catch (NoSuchMethodException unused) {
                subscriberWithUpdate.onUpdate(update);
            }
        }
    }

    public final boolean subscribe(@NotNull SubscriberWithUpdate<Update, Result> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        return !this.f14162b.contains(subscriber) && this.f14162b.add(subscriber);
    }

    public final boolean unsubscribe(@NotNull SubscriberWithUpdate<Update, Result> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        return this.f14162b.remove(subscriber);
    }
}
