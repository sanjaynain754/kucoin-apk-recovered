package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.uimanager.ViewProps;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Message.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m90084d2 = {"Landroidx/datastore/core/Message;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "lastState", "Landroidx/datastore/core/State;", "getLastState", "()Landroidx/datastore/core/State;", "Read", "Update", "Landroidx/datastore/core/Message$Read;", "Landroidx/datastore/core/Message$Update;", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public abstract class Message<T> {

    /* JADX INFO: compiled from: Message.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Landroidx/datastore/core/Message$Read;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/Message;", "lastState", "Landroidx/datastore/core/State;", "(Landroidx/datastore/core/State;)V", "getLastState", "()Landroidx/datastore/core/State;", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Read<T> extends Message<T> {

        @Nullable
        private final State<T> lastState;

        public Read(@Nullable State<T> state) {
            super(null);
            this.lastState = state;
        }

        @Override // androidx.datastore.core.Message
        @Nullable
        public State<T> getLastState() {
            return this.lastState;
        }
    }

    /* JADX INFO: compiled from: Message.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B`\u00121\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011RB\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m90084d2 = {"Landroidx/datastore/core/Message$Update;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/Message;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", ViewProps.TRANSFORM, "Lkotlinx/coroutines/w;", "ack", "Landroidx/datastore/core/State;", "lastState", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/w;Landroidx/datastore/core/State;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/jvm/functions/Function2;", "getTransform", "()Lkotlin/jvm/functions/Function2;", "Lkotlinx/coroutines/w;", "getAck", "()Lkotlinx/coroutines/w;", "Landroidx/datastore/core/State;", "getLastState", "()Landroidx/datastore/core/State;", "Lkotlin/coroutines/CoroutineContext;", "getCallerContext", "()Lkotlin/coroutines/CoroutineContext;", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Update<T> extends Message<T> {

        @NotNull
        private final InterfaceC41769w<T> ack;

        @NotNull
        private final CoroutineContext callerContext;

        @Nullable
        private final State<T> lastState;

        @NotNull
        private final Function2<T, Continuation<? super T>, Object> transform;

        @NotNull
        public final InterfaceC41769w<T> getAck() {
            return this.ack;
        }

        @NotNull
        public final CoroutineContext getCallerContext() {
            return this.callerContext;
        }

        @Override // androidx.datastore.core.Message
        @Nullable
        public State<T> getLastState() {
            return this.lastState;
        }

        @NotNull
        public final Function2<T, Continuation<? super T>, Object> getTransform() {
            return this.transform;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Update(@NotNull Function2<? super T, ? super Continuation<? super T>, ? extends Object> transform, @NotNull InterfaceC41769w<T> ack, @Nullable State<T> state, @NotNull CoroutineContext callerContext) {
            super(null);
            Intrinsics.checkNotNullParameter(transform, "transform");
            Intrinsics.checkNotNullParameter(ack, "ack");
            Intrinsics.checkNotNullParameter(callerContext, "callerContext");
            this.transform = transform;
            this.ack = ack;
            this.lastState = state;
            this.callerContext = callerContext;
        }
    }

    public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public abstract State<T> getLastState();

    private Message() {
    }
}
