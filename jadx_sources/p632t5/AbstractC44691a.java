package p632t5;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.datasource.AbstractDataSource;
import com.facebook.imagepipeline.producers.AbstractC5682c;
import com.facebook.imagepipeline.producers.C5684c1;
import com.facebook.imagepipeline.producers.InterfaceC5712m;
import com.facebook.imagepipeline.producers.InterfaceC5731v0;
import com.facebook.imagepipeline.producers.InterfaceC5733w0;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p192d6.C36621b;
import p712w3.C45708h;
import p821z5.InterfaceC46704c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: t5.a */
/* JADX INFO: compiled from: AbstractProducerToDataSourceAdapter.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B'\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0012\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, m90084d2 = {"Lt5/a;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/facebook/datasource/AbstractDataSource;", "", "Lcom/facebook/imagepipeline/producers/v0;", "producer", "Lcom/facebook/imagepipeline/producers/c1;", "settableProducerContext", "Lz5/c;", "requestListener", "<init>", "(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/c1;Lz5/c;)V", DbParams.KEY_CHANNEL_RESULT, "", "status", "Lcom/facebook/imagepipeline/producers/w0;", "producerContext", "", "C", "(Ljava/lang/Object;ILcom/facebook/imagepipeline/producers/w0;)V", "", "", "y", "(Lcom/facebook/imagepipeline/producers/w0;)Ljava/util/Map;", "", "close", "()Z", "Lcom/facebook/imagepipeline/producers/m;", "x", "()Lcom/facebook/imagepipeline/producers/m;", "", "throwable", "B", "(Ljava/lang/Throwable;)V", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()V", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/facebook/imagepipeline/producers/c1;", "z", "()Lcom/facebook/imagepipeline/producers/c1;", "i", "Lz5/c;", "getRequestListener", "()Lz5/c;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAbstractProducerToDataSourceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractProducerToDataSourceAdapter.kt\ncom/facebook/imagepipeline/datasource/AbstractProducerToDataSourceAdapter\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n*L\n1#1,106:1\n40#2,2:107\n40#2,9:109\n40#2,9:118\n44#2,3:127\n40#2,9:130\n40#2,9:139\n48#2:148\n*S KotlinDebug\n*F\n+ 1 AbstractProducerToDataSourceAdapter.kt\ncom/facebook/imagepipeline/datasource/AbstractProducerToDataSourceAdapter\n*L\n95#1:107,2\n97#1:109,9\n100#1:118,9\n95#1:127,3\n97#1:130,9\n100#1:139,9\n95#1:148\n*E\n"})
public abstract class AbstractC44691a<T> extends AbstractDataSource<T> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C5684c1 settableProducerContext;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC46704c requestListener;

    /* JADX INFO: renamed from: t5.a$a */
    /* JADX INFO: compiled from: AbstractProducerToDataSourceAdapter.kt */
    @Metadata(m90083d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"t5/a$a", "Lcom/facebook/imagepipeline/producers/c;", "newResult", "", "status", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/Object;I)V", "", "throwable", "g", "(Ljava/lang/Throwable;)V", "f", "()V", "", "progress", "i", "(F)V", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a extends AbstractC5682c<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC44691a<T> f99478b;

        public a(AbstractC44691a<T> abstractC44691a) {
            this.f99478b = abstractC44691a;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: f */
        public void mo9549f() {
            this.f99478b.m98851A();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: h */
        public void mo9551h(T newResult, int status) {
            AbstractC44691a<T> abstractC44691a = this.f99478b;
            abstractC44691a.mo98853C(newResult, status, abstractC44691a.getSettableProducerContext());
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: i */
        public void mo9552i(float progress) {
            this.f99478b.m8602p(progress);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: g */
        public void mo9550g(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f99478b.m98852B(throwable);
        }
    }

    /* JADX INFO: renamed from: A */
    public final synchronized void m98851A() {
        C45708h.m100898i(m8594h());
    }

    /* JADX INFO: renamed from: B */
    public final void m98852B(Throwable throwable) {
        if (super.m8600n(throwable, m98855y(this.settableProducerContext))) {
            this.requestListener.mo9461i(this.settableProducerContext, throwable);
        }
    }

    /* JADX INFO: renamed from: x */
    public final InterfaceC5712m<T> m98854x() {
        return new a(this);
    }

    @NotNull
    /* JADX INFO: renamed from: z, reason: from getter */
    public final C5684c1 getSettableProducerContext() {
        return this.settableProducerContext;
    }

    public AbstractC44691a(@NotNull InterfaceC5731v0<T> producer, @NotNull C5684c1 settableProducerContext, @NotNull InterfaceC46704c requestListener) {
        Intrinsics.checkNotNullParameter(producer, "producer");
        Intrinsics.checkNotNullParameter(settableProducerContext, "settableProducerContext");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        this.settableProducerContext = settableProducerContext;
        this.requestListener = requestListener;
        if (!C36621b.m81959d()) {
            m8598l(settableProducerContext.getExtras());
            if (!C36621b.m81959d()) {
                requestListener.mo9455c(settableProducerContext);
            } else {
                C36621b.m81957a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    requestListener.mo9455c(settableProducerContext);
                    Unit unit = Unit.INSTANCE;
                    C36621b.m81958b();
                } catch (Throwable th2) {
                    C36621b.m81958b();
                    throw th2;
                }
            }
            if (!C36621b.m81959d()) {
                producer.mo9524a(m98854x(), settableProducerContext);
                return;
            }
            C36621b.m81957a("AbstractProducerToDataSourceAdapter()->produceResult");
            try {
                producer.mo9524a(m98854x(), settableProducerContext);
                Unit unit2 = Unit.INSTANCE;
                return;
            } finally {
                C36621b.m81958b();
            }
        }
        C36621b.m81957a("AbstractProducerToDataSourceAdapter()");
        try {
            m8598l(settableProducerContext.getExtras());
            if (!C36621b.m81959d()) {
                requestListener.mo9455c(settableProducerContext);
            } else {
                C36621b.m81957a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    requestListener.mo9455c(settableProducerContext);
                    Unit unit3 = Unit.INSTANCE;
                    C36621b.m81958b();
                } catch (Throwable th3) {
                    C36621b.m81958b();
                    throw th3;
                }
            }
            if (!C36621b.m81959d()) {
                producer.mo9524a(m98854x(), settableProducerContext);
            } else {
                C36621b.m81957a("AbstractProducerToDataSourceAdapter()->produceResult");
                try {
                    producer.mo9524a(m98854x(), settableProducerContext);
                    Unit unit4 = Unit.INSTANCE;
                    C36621b.m81958b();
                } finally {
                    C36621b.m81958b();
                }
            }
            Unit unit5 = Unit.INSTANCE;
        } catch (Throwable th4) {
            C36621b.m81958b();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: C */
    public void mo98853C(@Nullable T result, int status, @NotNull InterfaceC5733w0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        boolean zM9645d = AbstractC5682c.m9645d(status);
        if (super.m8604r(result, zM9645d, m98855y(producerContext)) && zM9645d) {
            this.requestListener.mo9457e(this.settableProducerContext);
        }
    }

    @Override // com.facebook.datasource.AbstractDataSource, p251f4.InterfaceC37351b
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (!super.isFinished()) {
            this.requestListener.mo9459g(this.settableProducerContext);
            this.settableProducerContext.m9674q();
            return true;
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final Map<String, Object> m98855y(@NotNull InterfaceC5733w0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        return producerContext.getExtras();
    }
}
