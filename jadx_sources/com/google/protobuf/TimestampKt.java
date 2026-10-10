package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TimestampKt.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Lcom/google/protobuf/TimestampKt;", "", "()V", "Dsl", "protobuf-kotlin-lite"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class TimestampKt {

    @NotNull
    public static final TimestampKt INSTANCE = new TimestampKt();

    /* JADX INFO: compiled from: TimestampKt.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m90084d2 = {"Lcom/google/protobuf/TimestampKt$Dsl;", "", "_builder", "Lcom/google/protobuf/Timestamp$Builder;", "(Lcom/google/protobuf/Timestamp$Builder;)V", "value", "", "nanos", "getNanos", "()I", "setNanos", "(I)V", "", "seconds", "getSeconds", "()J", "setSeconds", "(J)V", "_build", "Lcom/google/protobuf/Timestamp;", "clearNanos", "", "clearSeconds", "Companion", "protobuf-kotlin-lite"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final Timestamp.Builder _builder;

        /* JADX INFO: compiled from: TimestampKt.kt */
        @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, m90084d2 = {"Lcom/google/protobuf/TimestampKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/TimestampKt$Dsl;", "builder", "Lcom/google/protobuf/Timestamp$Builder;", "protobuf-kotlin-lite"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @PublishedApi
            public final /* synthetic */ Dsl _create(Timestamp.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(Timestamp.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(Timestamp.Builder builder) {
            this._builder = builder;
        }

        @PublishedApi
        public final /* synthetic */ Timestamp _build() {
            Timestamp timestampBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(timestampBuild, "_builder.build()");
            return timestampBuild;
        }

        public final void clearNanos() {
            this._builder.clearNanos();
        }

        public final void clearSeconds() {
            this._builder.clearSeconds();
        }

        @JvmName(name = "getNanos")
        public final int getNanos() {
            return this._builder.getNanos();
        }

        @JvmName(name = "getSeconds")
        public final long getSeconds() {
            return this._builder.getSeconds();
        }

        @JvmName(name = "setNanos")
        public final void setNanos(int i11) {
            this._builder.setNanos(i11);
        }

        @JvmName(name = "setSeconds")
        public final void setSeconds(long j11) {
            this._builder.setSeconds(j11);
        }
    }

    private TimestampKt() {
    }
}
