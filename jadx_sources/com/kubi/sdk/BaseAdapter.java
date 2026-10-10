package com.kubi.sdk;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.core.util.Pools;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.sdk.exception.AppBaseException;
import com.tencent.bugly.proguard.C33954u6;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.p, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BaseAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003:\u0002@ABm\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b\u0012\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\b\u0012\u0010\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u001e\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u00100\u001a\u00020,H\u0016J.\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u00100\u001a\u00020,2\u000e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000202H\u0016J\u0016\u00103\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u0013\u00104\u001a\u00028\u00002\u0006\u00100\u001a\u00020,¢\u0006\u0002\u00105J\u0010\u00106\u001a\u0002072\u0006\u00100\u001a\u00020,H\u0016J\u0006\u00108\u001a\u000209J\b\u0010:\u001a\u00020,H\u0016J\u0010\u0010;\u001a\u00020,2\u0006\u00100\u001a\u00020,H\u0016J\u0010\u0010<\u001a\u00020.2\u0006\u0010=\u001a\u00020>H\u0016J\u0018\u0010?\u001a\u00020.2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0016R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001e\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0018\u0010&\u001a\f0'R\b\u0012\u0004\u0012\u00028\u00000\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006B"}, m90084d2 = {"Lcom/kubi/sdk/BaseAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/sdk/InnerViewHolder;", "data", "", "proxys", "Landroid/util/SparseArray;", "Ljava/lang/Class;", "shortCalls", "Lcom/kubi/sdk/ItemCallBack;", "longCalls", "diffCb", "Lcom/kubi/sdk/DiffCallBack;", "refreshCall", "Lcom/kubi/sdk/RefreshCallBack;", "<init>", "(Ljava/util/List;Landroid/util/SparseArray;Landroid/util/SparseArray;Landroid/util/SparseArray;Lcom/kubi/sdk/DiffCallBack;Lcom/kubi/sdk/RefreshCallBack;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getProxys", "()Landroid/util/SparseArray;", "getShortCalls", "getLongCalls", "getDiffCb", "()Lcom/kubi/sdk/DiffCallBack;", "getRefreshCall", "()Lcom/kubi/sdk/RefreshCallBack;", "setRefreshCall", "(Lcom/kubi/sdk/RefreshCallBack;)V", "extraData", "getExtraData", "()Ljava/lang/Object;", "setExtraData", "(Ljava/lang/Object;)V", "helper", "Lcom/kubi/sdk/BaseAdapter$DiffRefreshHelper;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "payloads", "", "onViewAttachedToWindow", "getItem", "(I)Ljava/lang/Object;", "getItemId", "", "isEmpty", "", "getItemCount", "getItemViewType", "onDetachedFromRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "refresh", "Builder", "DiffRefreshHelper", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class BaseAdapter<T> extends RecyclerView.Adapter<InnerViewHolder<T>> {

    /* JADX INFO: renamed from: i */
    @Nullable
    public volatile List<T> f47164i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final SparseArray<Class<?>> f47165j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final SparseArray<ItemCallBack<?>> f47166k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final SparseArray<ItemCallBack<?>> f47167l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public final DiffCallBack<T> f47168m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public RefreshCallBack f47169n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public Object f47170o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final BaseAdapter<T>.b f47171p;

    /* JADX INFO: renamed from: com.kubi.sdk.p$a */
    /* JADX INFO: compiled from: BaseAdapter.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006J\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\fJ\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u001cJ\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002JD\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\u0010*\u001a\u0006\u0012\u0002\b\u00030\u00132\n\u0010+\u001a\u0006\u0012\u0002\b\u00030\u00132\u000e\b\u0002\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00172\u000e\b\u0002\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010/H\u0016R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00060"}, m90084d2 = {"Lcom/kubi/sdk/BaseAdapter$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "data", "", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "diffCb", "Lcom/kubi/sdk/DiffCallBack;", "getDiffCb", "()Lcom/kubi/sdk/DiffCallBack;", "setDiffCb", "(Lcom/kubi/sdk/DiffCallBack;)V", "proxys", "Landroid/util/SparseArray;", "Ljava/lang/Class;", "getProxys", "()Landroid/util/SparseArray;", "shortCalls", "Lcom/kubi/sdk/ItemCallBack;", "getShortCalls", "longCalls", "getLongCalls", "refreshCall", "Lcom/kubi/sdk/RefreshCallBack;", "getRefreshCall", "()Lcom/kubi/sdk/RefreshCallBack;", "setRefreshCall", "(Lcom/kubi/sdk/RefreshCallBack;)V", "extraData", "getExtraData", "()Ljava/lang/Object;", "setExtraData", "(Ljava/lang/Object;)V", "setDiffCallBack", "setRefreshCallBack", "call", "register", "cls", "proxy", "shortCall", "longCall", "build", "Lcom/kubi/sdk/BaseAdapter;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBaseAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAdapter.kt\ncom/kubi/sdk/BaseAdapter$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n1#2:350\n*E\n"})
    public static class a<T> {

        /* JADX INFO: renamed from: a */
        @Nullable
        public List<T> f47172a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public DiffCallBack<T> f47173b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final SparseArray<Class<?>> f47174c = new SparseArray<>();

        /* JADX INFO: renamed from: d */
        @NotNull
        public final SparseArray<ItemCallBack<?>> f47175d = new SparseArray<>();

        /* JADX INFO: renamed from: e */
        @NotNull
        public final SparseArray<ItemCallBack<?>> f47176e = new SparseArray<>();

        /* JADX INFO: renamed from: f */
        @Nullable
        public RefreshCallBack f47177f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public Object f47178g;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ a m57323c(a aVar, Class cls, Class cls2, ItemCallBack itemCallBack, ItemCallBack itemCallBack2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
            }
            if ((i11 & 4) != 0) {
                itemCallBack = null;
            }
            if ((i11 & 8) != 0) {
                itemCallBack2 = null;
            }
            return aVar.m57325b(cls, cls2, itemCallBack, itemCallBack2);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public BaseAdapter<T> m57324a() {
            BaseAdapter<T> baseAdapter = new BaseAdapter<>(this.f47172a, this.f47174c, this.f47175d, this.f47176e, this.f47173b, this.f47177f);
            baseAdapter.m57322r(this.f47178g);
            return baseAdapter;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a<T> m57325b(@NotNull Class<?> cls, @NotNull Class<?> proxy, @Nullable ItemCallBack<?> itemCallBack, @Nullable ItemCallBack<?> itemCallBack2) {
            Intrinsics.checkNotNullParameter(cls, "cls");
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            this.f47174c.put(cls.getName().hashCode(), proxy);
            if (itemCallBack != null) {
                this.f47175d.put(cls.getName().hashCode(), itemCallBack);
            }
            if (itemCallBack2 != null) {
                this.f47176e.put(cls.getName().hashCode(), itemCallBack2);
            }
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final a<T> m57326d(@Nullable List<T> list) {
            this.f47172a = list;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final a<T> m57327e(@Nullable Object obj) {
            this.f47178g = obj;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.p$b */
    /* JADX INFO: compiled from: BaseAdapter.kt */
    @Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0015\u001a\u00020\u00162\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007J\u0006\u0010\u0018\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00078BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR&\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u000e\u001a&\u0012\"\u0012 \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\f\u0012\u0004\u0012\u00020\u000f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R@\u0010\u0012\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007 \u0014*\u0016\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0018\u00010\f0\f0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/sdk/BaseAdapter$DiffRefreshHelper;", "", "<init>", "(Lcom/kubi/sdk/BaseAdapter;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "lastData", "", "getLastData", "()Ljava/util/List;", "dataPool", "Landroidx/core/util/Pools$SynchronizedPool;", "Lcom/kubi/sdk/KV;", "", "diffPool", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "version", "Ljava/util/concurrent/atomic/AtomicLong;", "processor", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "refresh", "", "newData", "release", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBaseAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAdapter.kt\ncom/kubi/sdk/BaseAdapter$DiffRefreshHelper\n+ 2 AppBaseIssue.kt\ncom/kubi/sdk/exception/AppBaseIssueKt\n*L\n1#1,349:1\n45#2,2:350\n*S KotlinDebug\n*F\n+ 1 BaseAdapter.kt\ncom/kubi/sdk/BaseAdapter$DiffRefreshHelper\n*L\n171#1:350,2\n*E\n"})
    public final class b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final CompositeDisposable f47179a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public volatile List<T> f47180b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final Pools.SynchronizedPool<KV<Long, List<T>>> f47181c;

        /* JADX INFO: renamed from: d */
        @NotNull
        public final Pools.SynchronizedPool<KV<KV<Long, List<T>>, DiffUtil.DiffResult>> f47182d;

        /* JADX INFO: renamed from: e */
        @NotNull
        public final AtomicLong f47183e;

        /* JADX INFO: renamed from: f */
        @NotNull
        public final PublishSubject<KV<Long, List<T>>> f47184f;

        public b() {
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            this.f47179a = compositeDisposable;
            this.f47181c = new Pools.SynchronizedPool<>(5);
            this.f47182d = new Pools.SynchronizedPool<>(5);
            this.f47183e = new AtomicLong();
            PublishSubject<KV<Long, List<T>>> publishSubjectCreate = PublishSubject.create();
            Observable<KV<Long, List<T>>> observableObserveOn = publishSubjectCreate.observeOn(C42916f.m94134m());
            final Function1 function1 = new Function1() { // from class: com.kubi.sdk.q
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseAdapter.b.m57336j(this.f47600b, baseAdapter, (KV) obj);
                }
            };
            Observable<R> map = observableObserveOn.map(new Function() { // from class: com.kubi.sdk.r
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return BaseAdapter.b.m57337k(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.sdk.s
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(BaseAdapter.b.m57338l(this.f47690b, (KV) obj));
                }
            };
            Observable observableFilter = map.filter(new Predicate() { // from class: com.kubi.sdk.t
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return BaseAdapter.b.m57339m(function2, obj);
                }
            });
            final Function1 function3 = new Function1() { // from class: com.kubi.sdk.u
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseAdapter.b.m57340n(this.f48097b, (KV) obj);
                }
            };
            Observable<T> observableObserveOn2 = observableFilter.doOnNext(new Consumer() { // from class: com.kubi.sdk.v
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BaseAdapter.b.m57341o(function3, obj);
                }
            }).observeOn(AndroidSchedulers.mainThread());
            final Function1 function4 = new Function1() { // from class: com.kubi.sdk.w
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseAdapter.b.m57342p(baseAdapter, this, (KV) obj);
                }
            };
            Disposable disposableSubscribe = observableObserveOn2.subscribe(new Consumer() { // from class: com.kubi.sdk.x
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BaseAdapter.b.m57343q(function4, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, compositeDisposable);
            Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "apply(...)");
            this.f47184f = publishSubjectCreate;
        }

        /* JADX INFO: renamed from: j */
        public static final KV m57336j(b bVar, BaseAdapter baseAdapter, KV it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List<T> listM57344i = bVar.m57344i();
            List list = (List) it.m58211b();
            DiffCallBack<T> diffCallBackMo32189g = baseAdapter.mo32189g();
            Intrinsics.checkNotNull(diffCallBackMo32189g);
            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new InnerCallback(listM57344i, list, diffCallBackMo32189g));
            Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "calculateDiff(...)");
            KV<KV<Long, List<T>>, DiffUtil.DiffResult> kvAcquire = bVar.f47182d.acquire();
            if (kvAcquire == null) {
                return new KV(it, diffResultCalculateDiff);
            }
            kvAcquire.m58212c(it);
            kvAcquire.m58213d(diffResultCalculateDiff);
            return kvAcquire;
        }

        /* JADX INFO: renamed from: k */
        public static final KV m57337k(Function1 function1, Object p11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return (KV) function1.invoke(p11);
        }

        /* JADX INFO: renamed from: l */
        public static final boolean m57338l(b bVar, KV it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return ((Number) ((KV) it.m58210a()).m58210a()).longValue() == bVar.f47183e.get();
        }

        /* JADX INFO: renamed from: m */
        public static final boolean m57339m(Function1 function1, Object p11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return ((Boolean) function1.invoke(p11)).booleanValue();
        }

        /* JADX INFO: renamed from: i */
        public final List<T> m57344i() {
            List<T> list = this.f47180b;
            return list == null ? BaseAdapter.this.getData() : list;
        }

        /* JADX INFO: renamed from: r */
        public final void m57345r(@Nullable List<T> list) {
            if (BaseAdapter.this.getData() == null && (list == null || list.isEmpty())) {
                return;
            }
            if (BaseAdapter.this.mo32189g() == null || BaseAdapter.this.getData() == null) {
                BaseAdapter<T> baseAdapter = BaseAdapter.this;
                if (list == null) {
                    list = new ArrayList<>();
                }
                baseAdapter.mo32195q(list);
                RefreshCallBack f47169n = BaseAdapter.this.getF47169n();
                if (f47169n != null) {
                    f47169n.mo30779a();
                }
                BaseAdapter.this.notifyDataSetChanged();
                RefreshCallBack f47169n2 = BaseAdapter.this.getF47169n();
                if (f47169n2 != null) {
                    f47169n2.mo30780b();
                    return;
                }
                return;
            }
            PublishSubject<KV<Long, List<T>>> publishSubject = this.f47184f;
            KV<Long, List<T>> kvAcquire = this.f47181c.acquire();
            if (kvAcquire != null) {
                kvAcquire.m58212c(Long.valueOf(this.f47183e.incrementAndGet()));
                if (list == null) {
                    list = new ArrayList<>();
                }
                kvAcquire.m58213d(list);
            } else {
                Long lValueOf = Long.valueOf(this.f47183e.incrementAndGet());
                if (list == null) {
                    list = new ArrayList<>();
                }
                kvAcquire = new KV<>(lValueOf, list);
            }
            publishSubject.onNext(kvAcquire);
        }

        /* JADX INFO: renamed from: s */
        public final void m57346s() {
            this.f47179a.clear();
        }

        /* JADX INFO: renamed from: n */
        public static final Unit m57340n(b bVar, KV kv2) {
            bVar.f47180b = (List) ((KV) kv2.m58210a()).m58211b();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o */
        public static final void m57341o(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: p */
        public static final Unit m57342p(BaseAdapter baseAdapter, b bVar, KV kv2) {
            baseAdapter.mo32195q((List) ((KV) kv2.m58210a()).m58211b());
            RefreshCallBack f47169n = baseAdapter.getF47169n();
            if (f47169n != null) {
                f47169n.mo30779a();
            }
            ((DiffUtil.DiffResult) kv2.m58211b()).dispatchUpdatesTo(baseAdapter);
            RefreshCallBack f47169n2 = baseAdapter.getF47169n();
            if (f47169n2 != null) {
                f47169n2.mo30780b();
            }
            try {
                Pools.SynchronizedPool<KV<KV<Long, List<T>>, DiffUtil.DiffResult>> synchronizedPool = bVar.f47182d;
                Intrinsics.checkNotNull(kv2);
                synchronizedPool.release(kv2);
                bVar.f47181c.release((KV<Long, List<T>>) kv2.m58210a());
            } catch (Throwable th2) {
                C43846g.m96568c(new AppBaseException(th2, "DiffRefreshHelper", false, null, 8, null), null, 2, null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: q */
        public static final void m57343q(Function1 function1, Object obj) {
            function1.invoke(obj);
        }
    }

    public /* synthetic */ BaseAdapter(List list, SparseArray sparseArray, SparseArray sparseArray2, SparseArray sparseArray3, DiffCallBack diffCallBack, RefreshCallBack refreshCallBack, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, sparseArray, sparseArray2, sparseArray3, (i11 & 16) != 0 ? null : diffCallBack, (i11 & 32) != 0 ? null : refreshCallBack);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    public BaseAdapter(@Nullable List<T> list, @NotNull SparseArray<Class<?>> proxys, @NotNull SparseArray<ItemCallBack<?>> shortCalls, @NotNull SparseArray<ItemCallBack<?>> longCalls, @Nullable DiffCallBack<T> diffCallBack, @Nullable RefreshCallBack refreshCallBack) {
        Intrinsics.checkNotNullParameter(proxys, "proxys");
        Intrinsics.checkNotNullParameter(shortCalls, "shortCalls");
        Intrinsics.checkNotNullParameter(longCalls, "longCalls");
        this.f47164i = list;
        this.f47165j = proxys;
        this.f47166k = shortCalls;
        this.f47167l = longCalls;
        this.f47168m = diffCallBack;
        this.f47169n = refreshCallBack;
        this.f47171p = new b();
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public DiffCallBack<T> mo32189g() {
        return this.f47168m;
    }

    @Nullable
    public List<T> getData() {
        return this.f47164i;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public SparseArray<ItemCallBack<?>> mo32190h() {
        return this.f47167l;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public SparseArray<Class<?>> mo32191i() {
        return this.f47165j;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public RefreshCallBack getF47169n() {
        return this.f47169n;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public SparseArray<ItemCallBack<?>> mo32193k() {
        return this.f47166k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull InnerViewHolder<T> holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ViewHolderProxy.dispatchBindView$default(holder.m57940b(), getItem(i11), null, 2, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull InnerViewHolder<T> holder, int i11, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i11);
        } else {
            holder.m57940b().dispatchBindView(getItem(i11), payloads);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public InnerViewHolder<T> onCreateViewHolder(@NotNull ViewGroup parent, int i11) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Object objNewInstance = mo32191i().get(i11).getConstructor(ViewGroup.class, ItemCallBack.class, ItemCallBack.class).newInstance(parent, mo32193k().get(i11), mo32190h().get(i11));
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.kubi.sdk.ViewHolderProxy<T of com.kubi.sdk.BaseAdapter>");
        ViewHolderProxy viewHolderProxy = (ViewHolderProxy) objNewInstance;
        viewHolderProxy.setAdapterExtraData(this.f47170o);
        return new InnerViewHolder<>(parent, viewHolderProxy, null, 4, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: o */
    public void onViewAttachedToWindow(@NotNull InnerViewHolder<T> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.m57940b().onViewAttachedToWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f47171p.m57346s();
    }

    /* JADX INFO: renamed from: p */
    public void mo32194p(@Nullable List<T> list) {
        this.f47171p.m57345r(list);
    }

    /* JADX INFO: renamed from: q */
    public void mo32195q(@Nullable List<T> list) {
        this.f47164i = list;
    }

    /* JADX INFO: renamed from: r */
    public final void m57322r(@Nullable Object obj) {
        this.f47170o = obj;
    }

    @NotNull
    public final T getItem(int position) {
        List<T> data = getData();
        Intrinsics.checkNotNull(data);
        return data.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (getData() == null) {
            return 0;
        }
        List<T> data = getData();
        Intrinsics.checkNotNull(data);
        return data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getItem(position).getClass().getName().hashCode();
    }
}
