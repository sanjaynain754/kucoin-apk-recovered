package com.facebook.imagepipeline.datasource;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.datasource.AbstractDataSource;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SettableDataSource.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f*\u0004\b\u0000\u0010\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m90084d2 = {"Lcom/facebook/imagepipeline/datasource/SettableDataSource;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/facebook/datasource/AbstractDataSource;", "La4/a;", "<init>", "()V", "v", "()La4/a;", DbParams.KEY_CHANNEL_RESULT, "", "u", "(La4/a;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "Companion", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SettableDataSource<T> extends AbstractDataSource<AbstractC0110a<T>> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: SettableDataSource.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Lcom/facebook/imagepipeline/datasource/SettableDataSource$Companion;", "", "<init>", "()V", "create", "Lcom/facebook/imagepipeline/datasource/SettableDataSource;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final <V> SettableDataSource<V> create() {
            return new SettableDataSource<>(null);
        }
    }

    public /* synthetic */ SettableDataSource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public SettableDataSource() {
    }

    @Override // com.facebook.datasource.AbstractDataSource
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo8592e(@Nullable AbstractC0110a<T> result) {
        AbstractC0110a.m555j(result);
    }

    @Override // com.facebook.datasource.AbstractDataSource, p251f4.InterfaceC37351b
    @Nullable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public AbstractC0110a<T> getResult() {
        return AbstractC0110a.m553h((AbstractC0110a) super.getResult());
    }
}
