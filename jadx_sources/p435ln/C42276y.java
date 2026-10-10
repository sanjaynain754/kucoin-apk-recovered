package p435ln;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.kucoin.data.BUserCenterKit;
import com.kubi.kucoin.data.platform.IPlatformService;
import com.kubi.kucoin.data.platform.model.CountryEntity;
import com.kubi.kyc.CardEnum;
import com.kubi.kyc.R$id;
import com.kubi.kyc.R$layout;
import com.kubi.kyc.R$string;
import com.kubi.kyc.api.KycInfoEntity;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import zg0.AbstractC46843b;

/* JADX INFO: renamed from: ln.y */
/* JADX INFO: compiled from: KycInfoEntityCellViewBinder.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0014J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kyc/multitype/KycInfoEntityCellViewBinder;", "Lme/drakeet/multitype/ItemViewBinder;", "Lcom/kubi/kyc/api/KycInfoEntity;", "Lcom/kubi/kyc/multitype/KycInfoEntityCellViewBinder$ViewHolder;", "<init>", "()V", "gotoModify", "Lkotlin/Function0;", "", "getGotoModify", "()Lkotlin/jvm/functions/Function0;", "setGotoModify", "(Lkotlin/jvm/functions/Function0;)V", "onCreateViewHolder", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", C33954u6.f72238i, "item", "ofCardType", "", "type", "context", "Landroid/content/Context;", "ViewHolder", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKycInfoEntityCellViewBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KycInfoEntityCellViewBinder.kt\ncom/kubi/kyc/multitype/KycInfoEntityCellViewBinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
public final class C42276y extends AbstractC46843b<KycInfoEntity, a> {

    /* JADX INFO: renamed from: b */
    @Nullable
    public Function0<Unit> f93760b;

    /* JADX INFO: renamed from: ln.y$a */
    /* JADX INFO: compiled from: KycInfoEntityCellViewBinder.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\t¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/kyc/multitype/KycInfoEntityCellViewBinder$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "country", "getCountry", "idCardType", "getIdCardType", "idCardNumber", "getIdCardNumber", "primaryModify", "getPrimaryModify", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final TextView f93761g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final TextView f93762h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final TextView f93763i;

        /* JADX INFO: renamed from: j */
        @NotNull
        public final TextView f93764j;

        /* JADX INFO: renamed from: k */
        @NotNull
        public final TextView f93765k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.tv_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f93761g = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_country);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f93762h = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.tv_idcard_type);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f93763i = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(R$id.tv_idcard_number);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.f93764j = (TextView) viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(R$id.tv_kyc_primary_modify);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.f93765k = (TextView) viewFindViewById5;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextView getF93762h() {
            return this.f93762h;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getF93764j() {
            return this.f93764j;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getF93763i() {
            return this.f93763i;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextView getF93761g() {
            return this.f93761g;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextView getF93765k() {
            return this.f93765k;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m92783l(C42276y c42276y) {
        C44128b.m97261e("KycInfoEntityCellViewBinder", "primaryModify click");
        Function0<Unit> function0 = c42276y.f93760b;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // zg0.AbstractC46843b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo36822b(@NotNull a holder, @NotNull KycInfoEntity item) {
        Object next;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.getF93761g().setText(holder.itemView.getContext().getString(R$string.kyc_name) + "  " + C27041f.m66668h(item.getLastName()) + ' ' + C27041f.m66668h(item.getFirstName()));
        TextView f93762h = holder.getF93762h();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(holder.itemView.getContext().getString(R$string.kyc_nationality));
        sb2.append("  ");
        Iterator it = IPlatformService.m32057l((IPlatformService) BUserCenterKit.f27728a.m31968c(IPlatformService.class), null, 1, null).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((CountryEntity) next).getCode(), item.getRegionCode()));
        CountryEntity countryEntity = (CountryEntity) next;
        sb2.append(C27041f.m66668h(countryEntity != null ? countryEntity.text() : null));
        f93762h.setText(sb2.toString());
        TextView f93763i = holder.getF93763i();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(holder.itemView.getContext().getString(R$string.kyc_text_card_type));
        sb3.append("  ");
        String identityType = item.getIdentityType();
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        sb3.append(m92784j(identityType, context));
        f93763i.setText(sb3.toString());
        holder.getF93764j().setText(holder.itemView.getContext().getString(R$string.kyc_text_card_no) + "  " + item.getIdentityNumber());
        C27046k.m66710y(holder.getF93765k(), 3000L, new Function0() { // from class: ln.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42276y.m92783l(this.f93759b);
            }
        });
    }

    @Override // zg0.AbstractC46843b
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a mo36823d(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.busercenter_item_cell_kyc_primary_info, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new a(viewInflate);
    }

    /* JADX INFO: renamed from: n */
    public final void m92787n(@Nullable Function0<Unit> function0) {
        this.f93760b = function0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0024 A[RETURN] */
    /* JADX INFO: renamed from: j */
    public final String m92784j(String str, Context context) {
        for (CardEnum cardEnum : CardEnum.values()) {
            if (Intrinsics.areEqual(cardEnum.getCode(), str)) {
                if (cardEnum != null) {
                    return context.getString(cardEnum.getLabel());
                }
                return "";
            }
        }
        cardEnum = null;
        if (cardEnum != null) {
            return context.getString(cardEnum.getLabel());
        }
        return "";
    }
}
