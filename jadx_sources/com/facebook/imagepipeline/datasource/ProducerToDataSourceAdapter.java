package com.facebook.imagepipeline.datasource;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.imagepipeline.producers.C5684c1;
import com.facebook.imagepipeline.producers.InterfaceC5731v0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.jetbrains.annotations.NotNull;
import p251f4.InterfaceC37351b;
import p632t5.AbstractC44691a;
import p821z5.InterfaceC46704c;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProducerToDataSourceAdapter.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000b*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\fB'\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, m90084d2 = {"Lcom/facebook/imagepipeline/datasource/ProducerToDataSourceAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Lt5/a;", "Lcom/facebook/imagepipeline/producers/v0;", "producer", "Lcom/facebook/imagepipeline/producers/c1;", "settableProducerContext", "Lz5/c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/c1;Lz5/c;)V", "j", "Companion", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ProducerToDataSourceAdapter<T> extends AbstractC44691a<T> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: ProducerToDataSourceAdapter.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/facebook/imagepipeline/datasource/ProducerToDataSourceAdapter$Companion;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/facebook/imagepipeline/producers/v0;", "producer", "Lcom/facebook/imagepipeline/producers/c1;", "settableProducerContext", "Lz5/c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lf4/b;", "create", "(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/c1;Lz5/c;)Lf4/b;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final <T> InterfaceC37351b<T> create(@NotNull InterfaceC5731v0<T> producer, @NotNull C5684c1 settableProducerContext, @NotNull InterfaceC46704c listener) {
            Intrinsics.checkNotNullParameter(producer, "producer");
            Intrinsics.checkNotNullParameter(settableProducerContext, "settableProducerContext");
            Intrinsics.checkNotNullParameter(listener, "listener");
            return new ProducerToDataSourceAdapter(producer, settableProducerContext, listener, null);
        }
    }

    public /* synthetic */ ProducerToDataSourceAdapter(InterfaceC5731v0 interfaceC5731v0, C5684c1 c5684c1, InterfaceC46704c interfaceC46704c, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC5731v0, c5684c1, interfaceC46704c);
    }

    public ProducerToDataSourceAdapter(InterfaceC5731v0<T> interfaceC5731v0, C5684c1 c5684c1, InterfaceC46704c interfaceC46704c) {
        super(interfaceC5731v0, c5684c1, interfaceC46704c);
    }
}
