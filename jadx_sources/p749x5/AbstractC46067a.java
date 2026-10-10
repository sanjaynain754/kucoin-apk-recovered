package p749x5;

import com.facebook.fresco.middleware.HasExtraData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: x5.a */
/* JADX INFO: compiled from: BaseCloseableImage.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC46067a implements InterfaceC46071e {
    private static final Set<String> mImageExtrasList = new HashSet(Arrays.asList(HasExtraData.Companion.KEY_ENCODED_SIZE, HasExtraData.Companion.KEY_ENCODED_WIDTH, HasExtraData.Companion.KEY_ENCODED_HEIGHT, HasExtraData.Companion.KEY_URI_SOURCE, HasExtraData.Companion.KEY_IMAGE_FORMAT, HasExtraData.Companion.KEY_BITMAP_CONFIG, HasExtraData.Companion.KEY_IS_ROUNDED, HasExtraData.Companion.KEY_NON_FATAL_DECODE_ERROR, HasExtraData.Companion.KEY_ORIGINAL_URL, HasExtraData.Companion.KEY_MODIFIED_URL, HasExtraData.Companion.KEY_COLOR_SPACE));
    private InterfaceC46077k mCacheImageInfo;
    private Map<String, Object> mExtras = new HashMap();

    @Override // com.facebook.fresco.middleware.HasExtraData
    public <T> T getExtra(String str) {
        return (T) getExtra(str, null);
    }

    @Override // p749x5.InterfaceC46071e
    public boolean isStateful() {
        return false;
    }

    public <T> T getExtra(String str, T t11) {
        T t12 = (T) this.mExtras.get(str);
        return t12 == null ? t11 : t12;
    }

    @Override // p749x5.InterfaceC46076j, com.facebook.fresco.middleware.HasExtraData
    public Map<String, Object> getExtras() {
        return this.mExtras;
    }

    @Override // p749x5.InterfaceC46071e
    public InterfaceC46077k getImageInfo() {
        if (this.mCacheImageInfo == null) {
            this.mCacheImageInfo = new C46078l(getWidth(), getHeight(), getSizeInBytes(), getQualityInfo(), getExtras());
        }
        return this.mCacheImageInfo;
    }

    @Override // p749x5.InterfaceC46071e
    public InterfaceC46080n getQualityInfo() {
        return C46079m.f103527d;
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public <E> void putExtra(String str, E e11) {
        if (mImageExtrasList.contains(str)) {
            this.mExtras.put(str, e11);
        }
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public void putExtras(Map<String, ? extends Object> map) {
        if (map == null) {
            return;
        }
        for (String str : mImageExtrasList) {
            Object obj = map.get(str);
            if (obj != null) {
                this.mExtras.put(str, obj);
            }
        }
    }
}
