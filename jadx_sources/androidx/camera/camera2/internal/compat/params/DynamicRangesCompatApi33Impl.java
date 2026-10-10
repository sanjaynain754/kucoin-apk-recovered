package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(33)
class DynamicRangesCompatApi33Impl implements DynamicRangesCompat.DynamicRangeProfilesCompatImpl {
    private static final String TAG = "DynamicRangesCompatApi33Impl";
    private final DynamicRangeProfiles mDynamicRangeProfiles;

    private Long dynamicRangeToFirstSupportedProfile(DynamicRange dynamicRange) {
        return DynamicRangeConversions.dynamicRangeToFirstSupportedProfile(dynamicRange, this.mDynamicRangeProfiles);
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public Set<DynamicRange> getSupportedDynamicRanges() {
        return profileSetToDynamicRangeSet(this.mDynamicRangeProfiles.getSupportedProfiles());
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public DynamicRangeProfiles unwrap() {
        return this.mDynamicRangeProfiles;
    }

    public DynamicRangesCompatApi33Impl(Object obj) {
        this.mDynamicRangeProfiles = (DynamicRangeProfiles) obj;
    }

    private static Set<DynamicRange> profileSetToDynamicRangeSet(Set<Long> set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator<Long> it = set.iterator();
        while (it.hasNext()) {
            DynamicRange dynamicRangeProfileToDynamicRange = profileToDynamicRange(it.next().longValue());
            if (dynamicRangeProfileToDynamicRange != null) {
                hashSet.add(dynamicRangeProfileToDynamicRange);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static DynamicRange profileToDynamicRange(long j11) {
        DynamicRange dynamicRangeProfileToDynamicRange = DynamicRangeConversions.profileToDynamicRange(j11);
        if (dynamicRangeProfileToDynamicRange == null) {
            Logger.m1872w(TAG, "Dynamic range profile cannot be converted to a DynamicRange object: " + j11);
        }
        return dynamicRangeProfileToDynamicRange;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public Set<DynamicRange> getDynamicRangeCaptureRequestConstraints(DynamicRange dynamicRange) {
        boolean z11;
        Long lDynamicRangeToFirstSupportedProfile = dynamicRangeToFirstSupportedProfile(dynamicRange);
        if (lDynamicRangeToFirstSupportedProfile != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "DynamicRange is not supported: " + dynamicRange);
        return profileSetToDynamicRangeSet(this.mDynamicRangeProfiles.getProfileCaptureRequestConstraints(lDynamicRangeToFirstSupportedProfile.longValue()));
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public boolean isExtraLatencyPresent(DynamicRange dynamicRange) {
        boolean z11;
        Long lDynamicRangeToFirstSupportedProfile = dynamicRangeToFirstSupportedProfile(dynamicRange);
        if (lDynamicRangeToFirstSupportedProfile != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "DynamicRange is not supported: " + dynamicRange);
        return this.mDynamicRangeProfiles.isExtraLatencyPresent(lDynamicRangeToFirstSupportedProfile.longValue());
    }
}
