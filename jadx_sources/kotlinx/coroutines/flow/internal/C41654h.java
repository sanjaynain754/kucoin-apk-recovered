package kotlinx.coroutines.flow.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.h */
/* JADX INFO: compiled from: FlowExceptions.common.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "", TUIConstants.TUIChat.OWNER, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/flow/internal/AbortFlowException;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41654h {
    /* JADX INFO: renamed from: a */
    public static final void m90983a(@NotNull AbortFlowException abortFlowException, @NotNull Object obj) {
        if (abortFlowException.owner != obj) {
            throw abortFlowException;
        }
    }
}
