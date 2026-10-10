package com.sumsub.sns.core.widget;

import android.view.View;
import com.sumsub.sns.internal.core.presentation.widget.InterfaceC28973a;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0007\"(\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u000b\u001a\u00020\b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0015\u0010\u000e\u001a\u00020\b*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m90084d2 = {"Landroid/view/View;", "Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "value", "getSnsStepState", "(Landroid/view/View;)Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "setSnsStepState", "(Landroid/view/View;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V", "snsStepState", "", "getSnsStepDrawableState", "(Landroid/view/View;)[I", "snsStepDrawableState", "getToDrawableState", "(Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)[I", "toDrawableState", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSStepViewExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSStepViewExtensions.kt\ncom/sumsub/sns/core/widget/SNSStepViewExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class SNSStepViewExtensionsKt {

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SNSStepState.values().length];
            try {
                iArr[SNSStepState.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SNSStepState.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SNSStepState.APPROVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SNSStepState.REJECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SNSStepState.PROCESSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final int[] getSnsStepDrawableState(@NotNull View view) {
        SNSStepState sNSStepState;
        InterfaceC28973a interfaceC28973a = view instanceof InterfaceC28973a ? (InterfaceC28973a) view : null;
        if (interfaceC28973a == null || (sNSStepState = interfaceC28973a.getSNSStepState()) == null) {
            sNSStepState = SNSStepState.INIT;
        }
        return getToDrawableState(sNSStepState);
    }

    @NotNull
    public static final int[] getToDrawableState(@NotNull SNSStepState sNSStepState) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[sNSStepState.ordinal()];
        if (i11 == 1) {
            return SNSStepAttrs.INSTANCE.getSTATE_INIT();
        }
        if (i11 == 2) {
            return SNSStepAttrs.INSTANCE.getSTATE_PENDING();
        }
        if (i11 == 3) {
            return SNSStepAttrs.INSTANCE.getSTATE_APPROVED();
        }
        if (i11 == 4) {
            return SNSStepAttrs.INSTANCE.getSTATE_REJECTED();
        }
        if (i11 == 5) {
            return SNSStepAttrs.INSTANCE.getSTATE_PROCESSING();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void setSnsStepState(@NotNull View view, @NotNull SNSStepState sNSStepState) {
        if ((view instanceof InterfaceC28973a ? (InterfaceC28973a) view : null) != null) {
            ((InterfaceC28973a) view).setSNSStepState(sNSStepState);
        }
    }
}
