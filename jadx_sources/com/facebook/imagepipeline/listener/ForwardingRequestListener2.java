package com.facebook.imagepipeline.listener;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.imagepipeline.producers.InterfaceC5733w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p747x3.C45999a;
import p821z5.InterfaceC46704c;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ForwardingRequestListener2.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001)B\u001b\b\u0016\u0012\u0010\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0011\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0015\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u0017\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\nJ\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\nJ\u001f\u0010$\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010'¨\u0006*"}, m90084d2 = {"Lcom/facebook/imagepipeline/listener/ForwardingRequestListener2;", "Lz5/c;", "", "listenersToAdd", "<init>", "(Ljava/util/Set;)V", "Lcom/facebook/imagepipeline/producers/w0;", "producerContext", "", "c", "(Lcom/facebook/imagepipeline/producers/w0;)V", "", "producerName", "b", "(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;)V", "", "extraMap", "j", "(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Ljava/util/Map;)V", "", "t", "k", "(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "d", "producerEventName", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Ljava/lang/String;)V", "", "successful", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Z)V", "e", "throwable", "i", "(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/Throwable;)V", "g", "f", "(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;)Z", "", "Ljava/util/List;", "requestListeners", "Companion", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nForwardingRequestListener2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingRequestListener2.kt\ncom/facebook/imagepipeline/listener/ForwardingRequestListener2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n37#1:128\n38#1,7:130\n45#1:138\n37#1:139\n38#1,7:141\n45#1:149\n37#1:150\n38#1,7:152\n45#1:160\n37#1:161\n38#1,7:163\n45#1:171\n37#1:172\n38#1,7:174\n45#1:182\n37#1:183\n38#1,7:185\n45#1:193\n37#1:194\n38#1,7:196\n45#1:204\n37#1:205\n38#1,7:207\n45#1:215\n37#1:216\n38#1,7:218\n45#1:226\n37#1:227\n38#1,7:229\n45#1:237\n1863#2,2:126\n1863#2:129\n1864#2:137\n1863#2:140\n1864#2:148\n1863#2:151\n1864#2:159\n1863#2:162\n1864#2:170\n1863#2:173\n1864#2:181\n1863#2:184\n1864#2:192\n1863#2:195\n1864#2:203\n1863#2:206\n1864#2:214\n1863#2:217\n1864#2:225\n1863#2:228\n1864#2:236\n1755#2,3:238\n*S KotlinDebug\n*F\n+ 1 ForwardingRequestListener2.kt\ncom/facebook/imagepipeline/listener/ForwardingRequestListener2\n*L\n48#1:128\n48#1:130,7\n48#1:138\n52#1:139\n52#1:141,7\n52#1:149\n60#1:150\n60#1:152,7\n60#1:160\n71#1:161\n71#1:163,7\n71#1:171\n81#1:172\n81#1:174,7\n81#1:182\n91#1:183\n91#1:185,7\n91#1:193\n101#1:194\n101#1:196,7\n101#1:204\n107#1:205\n107#1:207,7\n107#1:215\n111#1:216\n111#1:218,7\n111#1:226\n115#1:227\n115#1:229,7\n115#1:237\n37#1:126,2\n48#1:129\n48#1:137\n52#1:140\n52#1:148\n60#1:151\n60#1:159\n71#1:162\n71#1:170\n81#1:173\n81#1:181\n91#1:184\n91#1:192\n101#1:195\n101#1:203\n107#1:206\n107#1:214\n111#1:217\n111#1:225\n115#1:228\n115#1:236\n119#1:238,3\n*E\n"})
public final class ForwardingRequestListener2 implements InterfaceC46704c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC46704c> requestListeners;

    @Override // com.facebook.imagepipeline.producers.InterfaceC5737y0
    /* JADX INFO: renamed from: d */
    public void mo9456d(@Nullable InterfaceC5733w0 producerContext, @Nullable String producerName, @Nullable Map<String, String> extraMap) {
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC46704c) it.next()).mo9456d(producerContext, producerName, extraMap);
            } catch (Exception e11) {
                C45999a.m101508n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5737y0
    /* JADX INFO: renamed from: j */
    public void mo9462j(@Nullable InterfaceC5733w0 producerContext, @Nullable String producerName, @Nullable Map<String, String> extraMap) {
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC46704c) it.next()).mo9462j(producerContext, producerName, extraMap);
            } catch (Exception e11) {
                C45999a.m101508n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5737y0
    /* JADX INFO: renamed from: k */
    public void mo9463k(@Nullable InterfaceC5733w0 producerContext, @Nullable String producerName, @Nullable Throwable t11, @Nullable Map<String, String> extraMap) {
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC46704c) it.next()).mo9463k(producerContext, producerName, t11, extraMap);
            } catch (Exception e11) {
                C45999a.m101508n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e11);
            }
        }
    }

    public ForwardingRequestListener2(@Nullable Set<? extends InterfaceC46704c> set) {
        if (set == null) {
            this.requestListeners = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.requestListeners = arrayList;
        CollectionsKt.filterNotNullTo(set, arrayList);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5737y0
    /* JADX INFO: renamed from: a */
    public void mo9453a(@NotNull InterfaceC5733w0 producerContext, @NotNull String producerName, boolean successful) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC46704c) it.next()).mo9453a(producerContext, producerName, successful);
            } catch (Exception e11) {
                C45999a.m101508n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5737y0
    /* JADX INFO: renamed from: b */
    public void mo9454b(@NotNull InterfaceC5733w0 producerContext, @NotNull String producerName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC46704c) it.next()).mo9454b(producerContext, producerName);
            } catch (Exception e11) {
                C45999a.m101508n("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e11);
            }
        }
    }

    @Override // p821z5.InterfaceC46704c
    /* JADX INFO: renamed from: c */
    public void mo9455c(@NotNull InterfaceC5733w0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC46704c) it.next()).mo9455c(producerContext);
            } catch (Exception e11) {
                C45999a.m101508n("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e11);
            }
        }
    }

    @Override // p821z5.InterfaceC46704c
    /* JADX INFO: renamed from: e */
    public void mo9457e(@NotNull InterfaceC5733w0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC46704c) it.next()).mo9457e(producerContext);
            } catch (Exception e11) {
                C45999a.m101508n("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5737y0
    /* JADX INFO: renamed from: f */
    public boolean mo9458f(@NotNull InterfaceC5733w0 producerContext, @NotNull String producerName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        List<InterfaceC46704c> list = this.requestListeners;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((InterfaceC46704c) it.next()).mo9458f(producerContext, producerName)) {
                return true;
            }
        }
        return false;
    }

    @Override // p821z5.InterfaceC46704c
    /* JADX INFO: renamed from: g */
    public void mo9459g(@NotNull InterfaceC5733w0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC46704c) it.next()).mo9459g(producerContext);
            } catch (Exception e11) {
                C45999a.m101508n("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5737y0
    /* JADX INFO: renamed from: h */
    public void mo9460h(@NotNull InterfaceC5733w0 producerContext, @NotNull String producerName, @NotNull String producerEventName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(producerEventName, "producerEventName");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC46704c) it.next()).mo9460h(producerContext, producerName, producerEventName);
            } catch (Exception e11) {
                C45999a.m101508n("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e11);
            }
        }
    }

    @Override // p821z5.InterfaceC46704c
    /* JADX INFO: renamed from: i */
    public void mo9461i(@NotNull InterfaceC5733w0 producerContext, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC46704c) it.next()).mo9461i(producerContext, throwable);
            } catch (Exception e11) {
                C45999a.m101508n("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e11);
            }
        }
    }
}
