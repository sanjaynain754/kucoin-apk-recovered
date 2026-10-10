package com.trtc.uikit.livekit.features.anchorprepare.view.liveinfoedit.livetemplatepicker;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.features.anchorprepare.store.AnchorPrepareStore;
import com.trtc.uikit.livekit.features.anchorprepare.view.liveinfoedit.livetemplatepicker.LiveTemplatePicker;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import io.trtc.tuikit.atomicx.widget.basicwidget.toast.AtomicToast;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiveTemplatePicker.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "context", "Landroid/content/Context;", "store", "Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;", "coreView", "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V", "initView", "", "initCoHostTemplateView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "initCoGuestTemplateView", "TemplateType", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LiveTemplatePicker extends AtomicPopover {

    /* JADX INFO: renamed from: m */
    @NotNull
    public final AnchorPrepareStore f78520m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final LiveCoreView f78521n;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'VERTICAL_DYNAMIC_GRID' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: LiveTemplatePicker.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;", "", "id", "", "desc", TUIConstants.TUIChat.INPUT_MORE_ICON, "<init>", "(Ljava/lang/String;IIII)V", "getId", "()I", "getDesc", "getIcon", "VERTICAL_DYNAMIC_GRID", "VERTICAL_DYNAMIC_FLOAT", "VERTICAL_STATIC_GRID", "VERTICAL_STATIC_FLOAT", "VERTICAL_DYNAMIC_GRID_CO_HOST", "VERTICAL_DYNAMIC_FLOAT_CO_HOST", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class TemplateType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final TemplateType VERTICAL_DYNAMIC_FLOAT;
        public static final TemplateType VERTICAL_DYNAMIC_FLOAT_CO_HOST;
        public static final TemplateType VERTICAL_DYNAMIC_GRID;
        public static final TemplateType VERTICAL_DYNAMIC_GRID_CO_HOST;
        public static final TemplateType VERTICAL_STATIC_FLOAT;
        public static final TemplateType VERTICAL_STATIC_GRID;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ TemplateType[] f78522b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f78523c;
        private final int desc;
        private final int icon;
        private final int id;

        /* JADX INFO: compiled from: LiveTemplatePicker.kt */
        @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType$Companion;", "", "<init>", "()V", "getNameById", "", "context", "Landroid/content/Context;", "id", "", "(Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            @NotNull
            public final String getNameById(@NotNull Context context, @Nullable Integer id2) {
                Intrinsics.checkNotNullParameter(context, "context");
                if (id2 == null) {
                    String string = context.getResources().getString(R$string.common_template_dynamic_grid);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    return string;
                }
                for (TemplateType templateType : TemplateType.values()) {
                    if (templateType.getId() == id2.intValue()) {
                        String string2 = context.getResources().getString(templateType.getDesc());
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        return string2;
                    }
                }
                String string3 = context.getResources().getString(R$string.common_template_dynamic_grid);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            }
        }

        static {
            int i11 = R$string.common_template_dynamic_grid;
            VERTICAL_DYNAMIC_GRID = new TemplateType("VERTICAL_DYNAMIC_GRID", 0, 600, i11, R$drawable.anchor_prepare_dynamic_grid);
            int i12 = R$string.common_template_dynamic_float;
            VERTICAL_DYNAMIC_FLOAT = new TemplateType("VERTICAL_DYNAMIC_FLOAT", 1, 601, i12, R$drawable.anchor_prepare_dynamic_float);
            VERTICAL_STATIC_GRID = new TemplateType("VERTICAL_STATIC_GRID", 2, 800, R$string.common_template_static_grid, R$drawable.anchor_prepare_static_grid);
            VERTICAL_STATIC_FLOAT = new TemplateType("VERTICAL_STATIC_FLOAT", 3, 801, R$string.common_template_static_float, R$drawable.anchor_prepare_static_float);
            VERTICAL_DYNAMIC_GRID_CO_HOST = new TemplateType("VERTICAL_DYNAMIC_GRID_CO_HOST", 4, 600, i11, R$drawable.anchor_prepare_dynamic_grid_co_host);
            VERTICAL_DYNAMIC_FLOAT_CO_HOST = new TemplateType("VERTICAL_DYNAMIC_FLOAT_CO_HOST", 5, 601, i12, R$drawable.anchor_prepare_dynamic_float_co_host);
            TemplateType[] templateTypeArrM80705a = m80705a();
            f78522b = templateTypeArrM80705a;
            f78523c = EnumEntriesKt.enumEntries(templateTypeArrM80705a);
            INSTANCE = new Companion(null);
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ TemplateType[] m80705a() {
            return new TemplateType[]{VERTICAL_DYNAMIC_GRID, VERTICAL_DYNAMIC_FLOAT, VERTICAL_STATIC_GRID, VERTICAL_STATIC_FLOAT, VERTICAL_DYNAMIC_GRID_CO_HOST, VERTICAL_DYNAMIC_FLOAT_CO_HOST};
        }

        @NotNull
        public static EnumEntries<TemplateType> getEntries() {
            return f78523c;
        }

        public static TemplateType valueOf(String str) {
            return (TemplateType) Enum.valueOf(TemplateType.class, str);
        }

        public static TemplateType[] values() {
            return (TemplateType[]) f78522b.clone();
        }

        public final int getDesc() {
            return this.desc;
        }

        public final int getIcon() {
            return this.icon;
        }

        public final int getId() {
            return this.id;
        }

        public TemplateType(String str, int i11, int i12, int i13, int i14) {
            super(str, i11);
            this.id = i12;
            this.desc = i13;
            this.icon = i14;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveTemplatePicker(@NotNull Context context, @NotNull AnchorPrepareStore store, @NotNull LiveCoreView coreView) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(coreView, "coreView");
        this.f78520m = store;
        this.f78521n = coreView;
        m80702I();
    }

    /* JADX INFO: renamed from: F */
    public static final void m80700F(LiveTemplatePicker liveTemplatePicker, TemplateType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        double width = ((double) liveTemplatePicker.f78521n.getWidth()) / ((double) liveTemplatePicker.f78521n.getHeight());
        if (type == TemplateType.VERTICAL_DYNAMIC_FLOAT && width > 0.5625d) {
            AtomicToast atomicToast = AtomicToast.f87566a;
            Context context = liveTemplatePicker.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            String string = liveTemplatePicker.getContext().getString(R$string.common_template_601_ui_exception_toast);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            AtomicToast.m88196j(atomicToast, context, string, AtomicToast.Style.WARNING, null, null, null, null, null, 248, null);
        }
        liveTemplatePicker.f78520m.m80641i(type.getId());
        liveTemplatePicker.dismiss();
    }

    /* JADX INFO: renamed from: H */
    public static final void m80701H(LiveTemplatePicker liveTemplatePicker, TemplateType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        double width = ((double) liveTemplatePicker.f78521n.getWidth()) / ((double) liveTemplatePicker.f78521n.getHeight());
        if (type == TemplateType.VERTICAL_DYNAMIC_FLOAT_CO_HOST && width > 0.5625d) {
            AtomicToast atomicToast = AtomicToast.f87566a;
            Context context = liveTemplatePicker.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            String string = liveTemplatePicker.getContext().getString(R$string.common_template_601_ui_exception_toast);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            AtomicToast.m88196j(atomicToast, context, string, AtomicToast.Style.WARNING, null, null, null, null, null, 248, null);
        }
        liveTemplatePicker.f78520m.m80642j(type.getId());
        liveTemplatePicker.dismiss();
    }

    /* JADX INFO: renamed from: E */
    public final void m80703E(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R$id.rv_template);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setAdapter(new CoGuestTemplatePickAdapter(context, this.f78520m, CollectionsKt.listOf((Object[]) new TemplateType[]{TemplateType.VERTICAL_DYNAMIC_GRID, TemplateType.VERTICAL_DYNAMIC_FLOAT, TemplateType.VERTICAL_STATIC_GRID, TemplateType.VERTICAL_STATIC_FLOAT}), new CoGuestTemplatePickAdapter.b() { // from class: ce0.d
            @Override // com.trtc.uikit.livekit.features.anchorprepare.view.liveinfoedit.livetemplatepicker.CoGuestTemplatePickAdapter.b
            /* JADX INFO: renamed from: a */
            public final void mo5173a(LiveTemplatePicker.TemplateType templateType) {
                LiveTemplatePicker.m80700F(this.f5499a, templateType);
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public final void m80704G(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R$id.rv_template_co_host);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setAdapter(new CoHostTemplatePickAdapter(context, this.f78520m, CollectionsKt.listOf(TemplateType.VERTICAL_DYNAMIC_GRID_CO_HOST), new CoHostTemplatePickAdapter.b() { // from class: ce0.c
            @Override // com.trtc.uikit.livekit.features.anchorprepare.view.liveinfoedit.livetemplatepicker.CoHostTemplatePickAdapter.b
            /* JADX INFO: renamed from: a */
            public final void mo5172a(LiveTemplatePicker.TemplateType templateType) {
                LiveTemplatePicker.m80701H(this.f5498a, templateType);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    private final void m80702I() {
        View viewInflate = View.inflate(getContext(), R$layout.anchor_prepare_layout_select_template, null);
        Intrinsics.checkNotNull(viewInflate);
        m80703E(viewInflate);
        m80704G(viewInflate);
        m88181q(viewInflate);
    }
}
