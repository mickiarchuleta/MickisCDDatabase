package com.example.mickiscddatabase;

        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;

        import androidx.fragment.app.Fragment;

public class AlbumsFragment extends Fragment {

    private Band mBand;
    public static final String ARG_BAND_ID = "band_id";
    public AlbumsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int bandId = 1;

        // Get the band ID from the fragment arguments
        Bundle args = getArguments();
        if (args != null) {
            bandId = args.getInt(ARG_BAND_ID);
        }

        // Get the selected band
        mBand = BandRepository.getInstance(requireContext()).getBand(bandId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_details, container, false);

        if (mBand != null) {
            TextView nameTextView = rootView.findViewById(R.id.band_description);
            nameTextView.setText(mBand.getDescription());

            TextView descriptionTextView = rootView.findViewById(R.id.band_works);
            descriptionTextView.setText(mBand.getWorks());

        }

        return rootView;
    }

}