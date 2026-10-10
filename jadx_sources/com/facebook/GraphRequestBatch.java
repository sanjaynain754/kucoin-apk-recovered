package com.facebook;

import android.os.Handler;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GraphRequestBatch.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0012\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001bF\u0017B\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0007\"\u00020\u0002¢\u0006\u0004\b\u0005\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010 J \u0010\"\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b$\u0010\fJ\r\u0010%\u001a\u00020\r¢\u0006\u0004\b%\u0010\u000fR$\u0010,\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u0017\u00104\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R0\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u0002052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u0002058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u00107\u001a\u0004\b8\u0010\fR0\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0010052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u0010058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b9\u0010\fR$\u0010>\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u00101\u001a\u0004\b;\u00103\"\u0004\b<\u0010=R$\u0010C\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010@¨\u0006G"}, m90084d2 = {"Lcom/facebook/GraphRequestBatch;", "Ljava/util/AbstractList;", "Lcom/facebook/GraphRequest;", "", "requests", "<init>", "(Ljava/util/Collection;)V", "", "([Lcom/facebook/GraphRequest;)V", "", "Lcom/facebook/GraphResponse;", "f", "()Ljava/util/List;", "Lcom/facebook/GraphRequestAsyncTask;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Lcom/facebook/GraphRequestAsyncTask;", "Lcom/facebook/GraphRequestBatch$a;", TUIConstants.TUIChat.CALL_BACK, "", "c", "(Lcom/facebook/GraphRequestBatch$a;)V", "element", "", "b", "(Lcom/facebook/GraphRequest;)Z", "", "index", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ILcom/facebook/GraphRequest;)V", "clear", "()V", "i", "(I)Lcom/facebook/GraphRequest;", "B", "D", "(ILcom/facebook/GraphRequest;)Lcom/facebook/GraphRequest;", "e", "g", "Landroid/os/Handler;", "Landroid/os/Handler;", "k", "()Landroid/os/Handler;", "F", "(Landroid/os/Handler;)V", "callbackHandler", "I", "timeoutInMilliseconds", "", "d", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "id", "", "<set-?>", "Ljava/util/List;", "n", CmcdData.Factory.STREAM_TYPE_LIVE, "callbacks", "j", "setBatchApplicationId", "(Ljava/lang/String;)V", "batchApplicationId", "r", "()I", "setTimeout", "(I)V", "timeout", "getSize", "size", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGraphRequestBatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphRequestBatch.kt\ncom/facebook/GraphRequestBatch\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
public final class GraphRequestBatch extends AbstractList<GraphRequest> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final AtomicInteger f7586i = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Handler callbackHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int timeoutInMilliseconds;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public List<GraphRequest> requests;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public List<InterfaceC5497a> callbacks;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public String batchApplicationId;

    /* JADX INFO: renamed from: com.facebook.GraphRequestBatch$a */
    /* JADX INFO: compiled from: GraphRequestBatch.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/facebook/GraphRequestBatch$a;", "", "Lcom/facebook/GraphRequestBatch;", "batch", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/GraphRequestBatch;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface InterfaceC5497a {
        /* JADX INFO: renamed from: a */
        void mo7738a(@NotNull GraphRequestBatch batch);
    }

    /* JADX INFO: renamed from: com.facebook.GraphRequestBatch$b */
    /* JADX INFO: compiled from: GraphRequestBatch.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/facebook/GraphRequestBatch$b;", "Lcom/facebook/GraphRequestBatch$a;", "Lcom/facebook/GraphRequestBatch;", "batch", "", "current", "max", "", "b", "(Lcom/facebook/GraphRequestBatch;JJ)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface InterfaceC5498b extends InterfaceC5497a {
        /* JADX INFO: renamed from: b */
        void m7739b(@NotNull GraphRequestBatch batch, long current, long max);
    }

    public GraphRequestBatch(@NotNull Collection<GraphRequest> requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.id = String.valueOf(Integer.valueOf(f7586i.incrementAndGet()));
        this.callbacks = new ArrayList();
        this.requests = new ArrayList(requests);
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public GraphRequest m7717B(int index) {
        return this.requests.remove(index);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public GraphRequest set(int index, @NotNull GraphRequest element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.requests.set(index, element);
    }

    /* JADX INFO: renamed from: F */
    public final void m7719F(@Nullable Handler handler) {
        this.callbackHandler = handler;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int index, @NotNull GraphRequest element) {
        Intrinsics.checkNotNullParameter(element, "element");
        this.requests.add(index, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean add(@NotNull GraphRequest element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.requests.add(element);
    }

    /* JADX INFO: renamed from: c */
    public final void m7722c(@NotNull InterfaceC5497a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.callbacks.contains(callback)) {
            return;
        }
        this.callbacks.add(callback);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.requests.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return m7723d((GraphRequest) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final List<GraphResponse> m7725f() {
        return GraphRequest.INSTANCE.executeBatchAndWait(this);
    }

    public int getSize() {
        return this.requests.size();
    }

    /* JADX INFO: renamed from: h */
    public final GraphRequestAsyncTask m7727h() {
        return GraphRequest.INSTANCE.executeBatchAsync(this);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public GraphRequest get(int index) {
        return this.requests.get(index);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return m7735s((GraphRequest) obj);
        }
        return -1;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getBatchApplicationId() {
        return this.batchApplicationId;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Handler getCallbackHandler() {
        return this.callbackHandler;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final List<InterfaceC5497a> m7731l() {
        return this.callbacks;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return m7736t((GraphRequest) obj);
        }
        return -1;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final List<GraphRequest> m7733n() {
        return this.requests;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getTimeoutInMilliseconds() {
        return this.timeoutInMilliseconds;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return m7716A((GraphRequest) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public /* bridge */ boolean m7716A(GraphRequest graphRequest) {
        return super.remove(graphRequest);
    }

    /* JADX INFO: renamed from: d */
    public /* bridge */ boolean m7723d(GraphRequest graphRequest) {
        return super.contains(graphRequest);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<GraphResponse> m7724e() {
        return m7725f();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final GraphRequestAsyncTask m7726g() {
        return m7727h();
    }

    /* JADX INFO: renamed from: s */
    public /* bridge */ int m7735s(GraphRequest graphRequest) {
        return super.indexOf(graphRequest);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    /* JADX INFO: renamed from: t */
    public /* bridge */ int m7736t(GraphRequest graphRequest) {
        return super.lastIndexOf(graphRequest);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ GraphRequest remove(int i11) {
        return m7717B(i11);
    }

    public GraphRequestBatch(@NotNull GraphRequest... requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.id = String.valueOf(Integer.valueOf(f7586i.incrementAndGet()));
        this.callbacks = new ArrayList();
        this.requests = new ArrayList(ArraysKt.asList(requests));
    }
}
