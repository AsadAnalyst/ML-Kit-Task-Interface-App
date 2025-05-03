cafasdasadwepackage com.example.mlkittaskinterfaceapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnText, btnFace, btnBarcode, btnObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnText = findViewById(R.id.btnTextRecognition);
        btnFace = findViewById(R.id.btnFaceDetection);
        btnBarcode = findViewById(R.id.btnBarcodeScanner);
        btnObject = findViewById(R.id.btnObjectDetection);

//        btnText.setOnClickListener(v -> startActivity(new Intent(this, TextRecognitionActivity.class)));
//        btnFace.setOnClickListener(v -> startActivity(new Intent(this, FaceDetectionActivity.class)));
//        btnBarcode.setOnClickListener(v -> startActivity(new Intent(this, BarcodeScannerActivity.class)));
//        btnObject.setOnClickListener(v -> startActivity(new Intent(this, ObjectDetectionActivity.class)));
    }
}
