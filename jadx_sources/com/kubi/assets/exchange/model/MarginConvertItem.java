package com.kubi.assets.exchange.model;

import io.chad.library.adapter.base.entity.MultiItemEntity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: MarginConvertItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/exchange/model/MarginConvertItem;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "itemType", "", "<init>", "(I)V", "getItemType", "Companion", "Lcom/kubi/assets/exchange/model/GroupHeaderItem;", "Lcom/kubi/assets/exchange/model/LineItem;", "Lcom/kubi/assets/exchange/model/SectionHeaderItem;", "Lcom/kubi/assets/exchange/model/TitleHeaderItem;", "Lcom/kubi/assets/exchange/model/TokenItem;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class MarginConvertItem implements MultiItemEntity {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f17247c = new Companion(null);

    /* JADX INFO: renamed from: b */
    public final int f17248b;

    /* JADX INFO: compiled from: MarginConvertItem.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/assets/exchange/model/MarginConvertItem$Companion;", "", "<init>", "()V", "TYPE_SECTION_HEADER", "", "TYPE_GROUP_HEADER", "TYPE_TITLE_HEADER", "TYPE_TOKEN_ITEM", "TYPE_LINE_ITEM", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ MarginConvertItem(int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11);
    }

    public MarginConvertItem(int i11) {
        this.f17248b = i11;
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType, reason: from getter */
    public int getF17248b() {
        return this.f17248b;
    }
}
