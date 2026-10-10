package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Booleans;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class Tracks {
    public static final Tracks EMPTY = new Tracks(ImmutableList.m13439of());
    private static final String FIELD_TRACK_GROUPS = Util.intToStringMaxRadix(0);
    private final ImmutableList<Group> groups;

    public static final class Group {
        private final boolean adaptiveSupported;
        public final int length;
        private final TrackGroup mediaTrackGroup;
        private final boolean[] trackSelected;
        private final int[] trackSupport;
        private static final String FIELD_TRACK_GROUP = Util.intToStringMaxRadix(0);
        private static final String FIELD_TRACK_SUPPORT = Util.intToStringMaxRadix(1);
        private static final String FIELD_TRACK_SELECTED = Util.intToStringMaxRadix(3);
        private static final String FIELD_ADAPTIVE_SUPPORTED = Util.intToStringMaxRadix(4);

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Group.class == obj.getClass()) {
                Group group = (Group) obj;
                if (this.adaptiveSupported == group.adaptiveSupported && this.mediaTrackGroup.equals(group.mediaTrackGroup) && Arrays.equals(this.trackSupport, group.trackSupport) && Arrays.equals(this.trackSelected, group.trackSelected)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isSupported() {
            return isSupported(false);
        }

        public boolean isTrackSupported(int i11) {
            return isTrackSupported(i11, false);
        }

        @UnstableApi
        public static Group fromBundle(Bundle bundle) {
            TrackGroup trackGroupFromBundle = TrackGroup.fromBundle((Bundle) Assertions.checkNotNull(bundle.getBundle(FIELD_TRACK_GROUP)));
            return new Group(trackGroupFromBundle, bundle.getBoolean(FIELD_ADAPTIVE_SUPPORTED, false), (int[]) MoreObjects.firstNonNull(bundle.getIntArray(FIELD_TRACK_SUPPORT), new int[trackGroupFromBundle.length]), (boolean[]) MoreObjects.firstNonNull(bundle.getBooleanArray(FIELD_TRACK_SELECTED), new boolean[trackGroupFromBundle.length]));
        }

        @UnstableApi
        public Group copyWithId(String str) {
            return new Group(this.mediaTrackGroup.copyWithId(str), this.adaptiveSupported, this.trackSupport, this.trackSelected);
        }

        public TrackGroup getMediaTrackGroup() {
            return this.mediaTrackGroup;
        }

        public Format getTrackFormat(int i11) {
            return this.mediaTrackGroup.getFormat(i11);
        }

        @UnstableApi
        public int getTrackSupport(int i11) {
            return this.trackSupport[i11];
        }

        public int getType() {
            return this.mediaTrackGroup.type;
        }

        public int hashCode() {
            return (((((this.mediaTrackGroup.hashCode() * 31) + (this.adaptiveSupported ? 1 : 0)) * 31) + Arrays.hashCode(this.trackSupport)) * 31) + Arrays.hashCode(this.trackSelected);
        }

        public boolean isAdaptiveSupported() {
            return this.adaptiveSupported;
        }

        public boolean isSelected() {
            return Booleans.contains(this.trackSelected, true);
        }

        public boolean isSupported(boolean z11) {
            for (int i11 = 0; i11 < this.trackSupport.length; i11++) {
                if (isTrackSupported(i11, z11)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isTrackSelected(int i11) {
            return this.trackSelected[i11];
        }

        public boolean isTrackSupported(int i11, boolean z11) {
            int i12 = this.trackSupport[i11];
            if (i12 != 4) {
                return z11 && i12 == 3;
            }
            return true;
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(FIELD_TRACK_GROUP, this.mediaTrackGroup.toBundle());
            bundle.putIntArray(FIELD_TRACK_SUPPORT, this.trackSupport);
            bundle.putBooleanArray(FIELD_TRACK_SELECTED, this.trackSelected);
            bundle.putBoolean(FIELD_ADAPTIVE_SUPPORTED, this.adaptiveSupported);
            return bundle;
        }

        @UnstableApi
        public Group(TrackGroup trackGroup, boolean z11, int[] iArr, boolean[] zArr) {
            boolean z12;
            int i11 = trackGroup.length;
            this.length = i11;
            boolean z13 = false;
            if (i11 == iArr.length && i11 == zArr.length) {
                z12 = true;
            } else {
                z12 = false;
            }
            Assertions.checkArgument(z12);
            this.mediaTrackGroup = trackGroup;
            if (z11 && i11 > 1) {
                z13 = true;
            }
            this.adaptiveSupported = z13;
            this.trackSupport = (int[]) iArr.clone();
            this.trackSelected = (boolean[]) zArr.clone();
        }
    }

    public boolean containsType(int i11) {
        for (int i12 = 0; i12 < this.groups.size(); i12++) {
            if (this.groups.get(i12).getType() == i11) {
                return true;
            }
        }
        return false;
    }

    public boolean isTypeSelected(int i11) {
        for (int i12 = 0; i12 < this.groups.size(); i12++) {
            Group group = this.groups.get(i12);
            if (group.isSelected() && group.getType() == i11) {
                return true;
            }
        }
        return false;
    }

    public boolean isTypeSupported(int i11) {
        return isTypeSupported(i11, false);
    }

    @UnstableApi
    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i11) {
        return isTypeSupportedOrEmpty(i11, false);
    }

    @UnstableApi
    public static Tracks fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_TRACK_GROUPS);
        return new Tracks(parcelableArrayList == null ? ImmutableList.m13439of() : BundleCollectionUtil.fromBundleList(new Function() { // from class: androidx.media3.common.n2
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return Tracks.Group.fromBundle((Bundle) obj);
            }
        }, parcelableArrayList));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Tracks.class != obj.getClass()) {
            return false;
        }
        return this.groups.equals(((Tracks) obj).groups);
    }

    public ImmutableList<Group> getGroups() {
        return this.groups;
    }

    public int hashCode() {
        return this.groups.hashCode();
    }

    public boolean isEmpty() {
        return this.groups.isEmpty();
    }

    public boolean isTypeSupported(int i11, boolean z11) {
        for (int i12 = 0; i12 < this.groups.size(); i12++) {
            if (this.groups.get(i12).getType() == i11 && this.groups.get(i12).isSupported(z11)) {
                return true;
            }
        }
        return false;
    }

    @UnstableApi
    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i11, boolean z11) {
        return !containsType(i11) || isTypeSupported(i11, z11);
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_TRACK_GROUPS, BundleCollectionUtil.toBundleArrayList(this.groups, new Function() { // from class: androidx.media3.common.m2
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return ((Tracks.Group) obj).toBundle();
            }
        }));
        return bundle;
    }

    @UnstableApi
    public Tracks(List<Group> list) {
        this.groups = ImmutableList.copyOf((Collection) list);
    }
}
