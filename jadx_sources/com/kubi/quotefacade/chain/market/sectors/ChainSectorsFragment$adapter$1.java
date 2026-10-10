package com.kubi.quotefacade.chain.market.sectors;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.quotefacade.R$font;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.chain.C21781i;
import com.kubi.quotefacade.entity.ChainMarketSectorsEntity;
import com.kubi.quotefacade.view.MultiTokenLogoView;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.round.widget.RoundImageView;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.utils.C27059l;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.List;
import org.json.JSONObject;
import p569qq.C43852m;
import p778xy.C46338a;
import p778xy.C46340c;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChainSectorsFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"com/kubi/quotefacade/chain/market/sectors/ChainSectorsFragment$adapter$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/quotefacade/entity/ChainMarketSectorsEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "measurePaint", "Landroid/graphics/Paint;", "convert", "", "helper", "item", "onViewAttachedToWindow", C33954u6.f72238i, "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChainSectorsFragment$adapter$1 extends BaseQuickAdapter<ChainMarketSectorsEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final Paint f41603i;

    public ChainSectorsFragment$adapter$1(int i11) {
        super(i11, null);
        Paint paint = new Paint();
        paint.setTextSize(C27040e.m66657a(14.0f));
        paint.setTypeface(ResourcesCompat.getFont(C27059l.f54343a.m66757a(), R$font.medium));
        this.f41603i = paint;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder baseViewHolder, final ChainMarketSectorsEntity chainMarketSectorsEntity) {
        Object objM103844constructorimpl;
        if (baseViewHolder == null || chainMarketSectorsEntity == null) {
            return;
        }
        final Context context = baseViewHolder.itemView.getContext();
        boolean zM6511a = C5303w0.m6511a();
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) baseViewHolder.getView(R$id.layoutInfo);
        if (linearLayoutCompat != null) {
            linearLayoutCompat.setGravity(zM6511a ? GravityCompat.END : GravityCompat.START);
            linearLayoutCompat.setPaddingRelative(C27040e.m66658b(16), 0, C27040e.m66658b(zM6511a ? 40 : 16), 0);
        }
        final RoundImageView roundImageView = (RoundImageView) baseViewHolder.getView(R$id.ivbg);
        if (roundImageView != null) {
            C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.chain.market.sectors.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChainSectorsFragment$adapter$1.m50999j(context, chainMarketSectorsEntity, roundImageView);
                }
            });
        }
        baseViewHolder.setText(R$id.tvName, chainMarketSectorsEntity.getConceptBlockName());
        BigDecimal tokenPriceChange = chainMarketSectorsEntity.getTokenPriceChange();
        TextView textView = (TextView) baseViewHolder.getView(R$id.tvRate);
        if (textView != null) {
            textView.setText(C21781i.m50836b(tokenPriceChange, false, 1, null));
            Intrinsics.checkNotNull(context);
            textView.setTextColor(C22890g.m54279d(context, tokenPriceChange != null ? tokenPriceChange.doubleValue() : 0.0d, 0, 2, null));
            int iM66658b = C27040e.m66658b(zM6511a ? 92 : 116);
            try {
                Result.Companion companion = Result.INSTANCE;
                Paint paint = this.f41603i;
                String conceptBlockName = chainMarketSectorsEntity.getConceptBlockName();
                if (conceptBlockName == null) {
                    conceptBlockName = "";
                }
                objM103844constructorimpl = Result.m103844constructorimpl(Float.valueOf(paint.measureText(conceptBlockName)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Float fValueOf = Float.valueOf(0.0f);
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = fValueOf;
            }
            boolean z11 = ((Number) objM103844constructorimpl).floatValue() > ((float) iM66658b);
            textView.setTextSize(z11 ? 13.0f : 14.0f);
            C27046k.m66692g(textView, z11 ? 0 : C27040e.m66658b(6));
        }
        List<String> topLogo = chainMarketSectorsEntity.getTopLogo();
        if (topLogo == null) {
            topLogo = CollectionsKt.emptyList();
        }
        MultiTokenLogoView multiTokenLogoView = (MultiTokenLogoView) baseViewHolder.getView(R$id.logoView);
        if (multiTokenLogoView != null) {
            multiTokenLogoView.setLogoList(CollectionsKt.take(topLogo, 3));
        }
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66710y(itemView, 1000L, new Function0() { // from class: com.kubi.quotefacade.chain.market.sectors.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainSectorsFragment$adapter$1.m51000k(chainMarketSectorsEntity);
            }
        });
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        String id2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        ChainMarketSectorsEntity item = getItem(holder.getBindingAdapterPosition());
        if (item == null || (id2 = item.getId()) == null) {
            return;
        }
        C43852m.m96595g("B8LineCoins", "Sectors", null, new JSONObject().put("type", id2), 4, null);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m50999j(Context context, ChainMarketSectorsEntity chainMarketSectorsEntity, RoundImageView roundImageView) {
        C46340c<Drawable> c46340cMo6634v = C46338a.m102151a(context).mo6634v(chainMarketSectorsEntity.bgImage());
        int i11 = R$mipmap.quote_chain_sectors_placeholder;
        c46340cMo6634v.mo92188b0(i11).mo92208m(i11).m6594E0(roundImageView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m51000k(ChainMarketSectorsEntity chainMarketSectorsEntity) {
        String id2 = chainMarketSectorsEntity.getId();
        if (id2 == null) {
            return Unit.INSTANCE;
        }
        KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, "market/chainDetail?id=" + id2, false, null, 4, null);
        C43852m.m96591c("B8LineCoins", "Sectors", null, new JSONObject().put("type", id2), 4, null);
        return Unit.INSTANCE;
    }
}
