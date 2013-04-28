package gov.awaaz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Health extends Activity
{
   public void onCreate(Bundle icicle)
   {
      super.onCreate(icicle);
      setContentView(R.layout.health);
      Button b = (Button) findViewById(R.id.button4);
      b.setOnClickListener(new View.OnClickListener() {
         public void onClick(View arg0) {
         setResult(RESULT_OK);
         finish();
         }
      });
   }
}