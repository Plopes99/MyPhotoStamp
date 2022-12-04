package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.almofadas.*
import kotlinx.android.synthetic.main.todos.*

class todos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.todos)

        feito.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()
        }

        bktodos.setOnClickListener {
            startActivity(Intent(this,cat::class.java))
            finish()
        }

        hometodos.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()
        }

        val image:String = intent.getStringExtra("image")
        if(image=="z1"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.almo1)
        }

        val image1:String = intent.getStringExtra("image")
        if(image=="z2"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.almo2)
        }

        val image2:String = intent.getStringExtra("image")
        if(image=="z3"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.almo3)
        }

        val image3:String = intent.getStringExtra("image")
        if(image=="z4"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.almo4)
        }

        val image4:String = intent.getStringExtra("image")
        if(image=="z5"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.almo5)
        }

        val image5:String = intent.getStringExtra("image")
        if(image=="z6"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.almo6)
        }

        val image6:String = intent.getStringExtra("image")
        if(image=="z7"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.almo7)
        }

        val image7:String = intent.getStringExtra("image")
        if(image=="z8"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.almo8)
        }

        val image9:String = intent.getStringExtra("image")
        if(image=="z9"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.almo9)
        }

        val image10:String = intent.getStringExtra("image")
        if(image=="z10"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.anime1)
        }

        val image11:String = intent.getStringExtra("image")
        if(image=="z11"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.anime2)
        }

        val image12:String = intent.getStringExtra("image")
        if(image=="z12"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.anime3)
        }

        val image13:String = intent.getStringExtra("image")
        if(image=="z13"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.anime4)
        }

        val image14:String = intent.getStringExtra("image")
        if(image=="z14"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.anime5)
        }

        val image15:String = intent.getStringExtra("image")
        if(image=="z15"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.anime6)
        }

        val image16:String = intent.getStringExtra("image")
        if(image=="z16"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.anime7)
        }

        val image17:String = intent.getStringExtra("image")
        if(image=="z17"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.anime8)
        }

        val image18:String = intent.getStringExtra("image")
        if(image=="z18"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.animais1)
        }

        val image19:String = intent.getStringExtra("image")
        if(image=="z19"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.animais2)
        }

        val image20:String = intent.getStringExtra("image")
        if(image=="z20"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.animais3)
        }


        val image21:String = intent.getStringExtra("image")
        if(image=="z21"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.animais4)
        }

        val image22:String = intent.getStringExtra("image")
        if(image=="z22"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.animais5)
        }

        val image23:String = intent.getStringExtra("image")
        if(image=="z23"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.animais6)
        }

        val image24:String = intent.getStringExtra("image")
        if(image=="z24"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.animais7)
        }

        val image25:String = intent.getStringExtra("image")
        if(image=="z25"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.auto1)
        }

        val image26:String = intent.getStringExtra("image")
        if(image=="z26"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.auto2)
        }

        val image27:String = intent.getStringExtra("image")
        if(image=="z27"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.auto3)
        }

        val image28:String = intent.getStringExtra("image")
        if(image=="z28"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.auto4)
        }

        val image29:String = intent.getStringExtra("image")
        if(image=="z29"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.auto5)
        }

        val image30:String = intent.getStringExtra("image")
        if(image=="z30"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.auto8)
        }

        val image31:String = intent.getStringExtra("image")
        if(image=="z31"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.basket1)
        }

        val image32:String = intent.getStringExtra("image")
        if(image=="z32"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.basket2)
        }

        val image33:String = intent.getStringExtra("image")
        if(image=="z33"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.basket3)
        }

        val image34:String = intent.getStringExtra("image")
        if(image=="z34"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.basket4)
        }

        val image35:String = intent.getStringExtra("image")
        if(image=="z35"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.basket5)
        }

        val image36:String = intent.getStringExtra("image")
        if(image=="z36"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.basket6)
        }

        val image37:String = intent.getStringExtra("image")
        if(image=="z37"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.basket7)
        }

        val image38:String = intent.getStringExtra("image")
        if(image=="z38"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.bebida1)
        }

        val image39:String = intent.getStringExtra("image")
        if(image=="z39"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.bebida2)
        }

        val image40:String = intent.getStringExtra("image")
        if(image=="z40"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.bebida3)
        }

        val image41:String = intent.getStringExtra("image")
        if(image=="z41"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.bebida4)
        }

        val image42:String = intent.getStringExtra("image")
        if(image=="z42"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.bebida5)
        }

        val image43:String = intent.getStringExtra("image")
        if(image=="z43"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.bebida6)
        }

        val image44:String = intent.getStringExtra("image")
        if(image=="z44"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.caneca1)
        }

        val image45:String = intent.getStringExtra("image")
        if(image=="z45"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.caneca2)
        }

        val image46:String = intent.getStringExtra("image")
        if(image=="z46"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.caneca3)
        }

        val image47:String = intent.getStringExtra("image")
        if(image=="z47"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.caneca4)
        }

        val image48:String = intent.getStringExtra("image")
        if(image=="z48"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.caneca5)
        }

        val image49:String = intent.getStringExtra("image")
        if(image=="z49"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.caneca6)
        }

        val image50:String = intent.getStringExtra("image")
        if(image=="z50"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.caneca7)
        }

        val image51:String = intent.getStringExtra("image")
        if(image=="z51"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.caneca8)
        }

        val image52:String = intent.getStringExtra("image")
        if(image=="z52"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.filmes1)
        }

        val image53:String = intent.getStringExtra("image")
        if(image=="z53"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.filmes2)
        }

        val image54:String = intent.getStringExtra("image")
        if(image=="z54"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.filmes3)
        }

        val image55:String = intent.getStringExtra("image")
        if(image=="z55"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.filmes4)
        }

        val image56:String = intent.getStringExtra("image")
        if(image=="z56"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.filmes5)
        }

        val image57:String = intent.getStringExtra("image")
        if(image=="z57"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.filmes6)
        }

        val image58:String = intent.getStringExtra("image")
        if(image=="z58"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.filmes7)
        }

        val image59:String = intent.getStringExtra("image")
        if(image=="z59"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.filmes8)
        }

        val image60:String = intent.getStringExtra("image")
        if(image=="z60"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.game1)
        }

        val image61:String = intent.getStringExtra("image")
        if(image=="z61"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.game2)
        }

        val image62:String = intent.getStringExtra("image")
        if(image=="z62"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.game3)
        }

        val image63:String = intent.getStringExtra("image")
        if(image=="z63"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.game4)
        }

        val image64:String = intent.getStringExtra("image")
        if(image=="z64"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.game5)
        }

        val image65:String = intent.getStringExtra("image")
        if(image=="z65"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.game6)
        }

        val image66:String = intent.getStringExtra("image")
        if(image=="z66"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.game7)
        }

        val image67:String = intent.getStringExtra("image")
        if(image=="z67"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.gym1)
        }

        val image68:String = intent.getStringExtra("image")
        if(image=="z68"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.gym2)
        }

        val image69:String = intent.getStringExtra("image")
        if(image=="z69"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.gym3)
        }

        val image70:String = intent.getStringExtra("image")
        if(image=="z70"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.gym4)
        }

        val image71:String = intent.getStringExtra("image")
        if(image=="z71"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.gym5)
        }

        val image72:String = intent.getStringExtra("image")
        if(image=="z72"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.gym6)
        }

        val image73:String = intent.getStringExtra("image")
        if(image=="z73"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.gym7)
        }

        val image74:String = intent.getStringExtra("image")
        if(image=="z74"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin1)
        }

        val image75:String = intent.getStringExtra("image")
        if(image=="z75"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin2)
        }

        val image76:String = intent.getStringExtra("image")
        if(image=="z76"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin3)
        }

        val image77:String = intent.getStringExtra("image")
        if(image=="z77"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin4)
        }

        val image78:String = intent.getStringExtra("image")
        if(image=="z78"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin5)
        }

        val image79:String = intent.getStringExtra("image")
        if(image=="z79"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin6)
        }

        val image80:String = intent.getStringExtra("image")
        if(image=="z80"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin7)
        }

        val image81:String = intent.getStringExtra("image")
        if(image=="z81"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin8)
        }

        val image82:String = intent.getStringExtra("image")
        if(image=="z82"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin9)
        }

        val image83:String = intent.getStringExtra("image")
        if(image=="z83"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin10)
        }

        val image84:String = intent.getStringExtra("image")
        if(image=="z83"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin10)
        }

        val image101:String = intent.getStringExtra("image")
        if(image=="x1"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.almo1)
        }

        val image102:String = intent.getStringExtra("image")
        if(image=="x2"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.almo2)
        }

        val image103:String = intent.getStringExtra("image")
        if(image=="x3"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.almo3)
        }

        val image104:String = intent.getStringExtra("image")
        if(image=="x4"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.almo4)
        }

        val image105:String = intent.getStringExtra("image")
        if(image=="x5"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.almo5)
        }

        val image106:String = intent.getStringExtra("image")
        if(image=="x6"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.almo6)
        }

        val image107:String = intent.getStringExtra("image")
        if(image=="x7"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.almo7)
        }

        val image108:String = intent.getStringExtra("image")
        if(image=="x8"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.almo8)
        }

        val image109:String = intent.getStringExtra("image")
        if(image=="x9"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.almo9)
        }

        val image110:String = intent.getStringExtra("image")
        if(image=="x10"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.anime1)
        }

        val image111:String = intent.getStringExtra("image")
        if(image=="x11"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.anime2)
        }

        val image112:String = intent.getStringExtra("image")
        if(image=="x12"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.anime3)
        }

        val image113:String = intent.getStringExtra("image")
        if(image=="x13"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.anime4)
        }

        val image114:String = intent.getStringExtra("image")
        if(image=="x14"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.anime5)
        }

        val image115:String = intent.getStringExtra("image")
        if(image=="x15"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.anime6)
        }

        val image116:String = intent.getStringExtra("image")
        if(image=="x16"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.anime7)
        }

        val image117:String = intent.getStringExtra("image")
        if(image=="x17"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.anime8)
        }


        val image121:String = intent.getStringExtra("image")
        if(image=="x21"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.animais1)
        }

        val image122:String = intent.getStringExtra("image")
        if(image=="x22"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.animais2)
        }

        val image123:String = intent.getStringExtra("image")
        if(image=="x23"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.animais3)
        }

        val image124:String = intent.getStringExtra("image")
        if(image=="x24"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.animais4)
        }

        val image125:String = intent.getStringExtra("image")
        if(image=="x25"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.animais5)
        }

        val image126:String = intent.getStringExtra("image")
        if(image=="x26"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.animais6)
        }

        val image127:String = intent.getStringExtra("image")
        if(image=="x27"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.animais7)
        }

        val image131:String = intent.getStringExtra("image")
        if(image=="x31"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.auto1)
        }

        val image132:String = intent.getStringExtra("image")
        if(image=="x32"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.auto2)
        }

        val image133:String = intent.getStringExtra("image")
        if(image=="x33"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.auto3)
        }

        val image134:String = intent.getStringExtra("image")
        if(image=="x34"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.auto4)
        }

        val image135:String = intent.getStringExtra("image")
        if(image=="x35"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.auto5)
        }

        val image136:String = intent.getStringExtra("image")
        if(image=="x36"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.auto8)
        }

        val image141:String = intent.getStringExtra("image")
        if(image=="x41"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.basket1)
        }

        val image142:String = intent.getStringExtra("image")
        if(image=="x42"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.basket2)
        }

        val image143:String = intent.getStringExtra("image")
        if(image=="x43"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.basket3)
        }

        val image144:String = intent.getStringExtra("image")
        if(image=="x44"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.basket4)
        }

        val image145:String = intent.getStringExtra("image")
        if(image=="x45"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.basket5)
        }

        val image146:String = intent.getStringExtra("image")
        if(image=="x46"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.basket6)
        }

        val image147:String = intent.getStringExtra("image")
        if(image=="x47"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.basket7)
        }

        val image151:String = intent.getStringExtra("image")
        if(image=="x51"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.bebida1)
        }

        val image152:String = intent.getStringExtra("image")
        if(image=="x52"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.bebida2)
        }

        val image153:String = intent.getStringExtra("image")
        if(image=="x53"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.bebida3)
        }

        val image154:String = intent.getStringExtra("image")
        if(image=="x54"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.bebida4)
        }

        val image155:String = intent.getStringExtra("image")
        if(image=="x55"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.bebida5)
        }

        val image156:String = intent.getStringExtra("image")
        if(image=="x56"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.bebida6)
        }

        val image161:String = intent.getStringExtra("image")
        if(image=="x61"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.caneca1)
        }

        val image162:String = intent.getStringExtra("image")
        if(image=="x62"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.caneca2)
        }

        val image163:String = intent.getStringExtra("image")
        if(image=="x63"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.caneca3)
        }

        val image164:String = intent.getStringExtra("image")
        if(image=="x64"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.caneca4)
        }

        val image165:String = intent.getStringExtra("image")
        if(image=="x65"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.caneca5)
        }

        val image166:String = intent.getStringExtra("image")
        if(image=="x66"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.caneca6)
        }

        val image167:String = intent.getStringExtra("image")
        if(image=="x67"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.caneca7)
        }

        val image168:String = intent.getStringExtra("image")
        if(image=="x68"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.caneca8)
        }

        val image171:String = intent.getStringExtra("image")
        if(image=="x71"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.filmes1)
        }

        val image172:String = intent.getStringExtra("image")
        if(image=="x72"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.filmes2)
        }

        val image173:String = intent.getStringExtra("image")
        if(image=="x73"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.filmes3)
        }

        val image174:String = intent.getStringExtra("image")
        if(image=="x74"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.filmes4)
        }

        val image175:String = intent.getStringExtra("image")
        if(image=="x75"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.filmes5)
        }

        val image176:String = intent.getStringExtra("image")
        if(image=="x76"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.filmes6)
        }

        val image177:String = intent.getStringExtra("image")
        if(image=="x77"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.filmes7)
        }

        val image178:String = intent.getStringExtra("image")
        if(image=="x78"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.filmes8)
        }

        val image181:String = intent.getStringExtra("image")
        if(image=="x81"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.game1)
        }

        val image182:String = intent.getStringExtra("image")
        if(image=="x82"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.game2)
        }

        val image183:String = intent.getStringExtra("image")
        if(image=="x83"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.game3)
        }

        val image184:String = intent.getStringExtra("image")
        if(image=="x84"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.game4)
        }

        val image185:String = intent.getStringExtra("image")
        if(image=="x85"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.game5)
        }

        val image186:String = intent.getStringExtra("image")
        if(image=="x86"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.game6)
        }

        val image187:String = intent.getStringExtra("image")
        if(image=="x87"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.game7)
        }

        val image191:String = intent.getStringExtra("image")
        if(image=="x91"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.gym1)
        }

        val image192:String = intent.getStringExtra("image")
        if(image=="x92"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.gym2)
        }

        val image193:String = intent.getStringExtra("image")
        if(image=="x93"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.gym3)
        }

        val image194:String = intent.getStringExtra("image")
        if(image=="x94"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.gym4)
        }

        val image195:String = intent.getStringExtra("image")
        if(image=="x95"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.gym5)
        }

        val image196:String = intent.getStringExtra("image")
        if(image=="x96"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.gym6)
        }

        val image197:String = intent.getStringExtra("image")
        if(image=="x97"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.gym7)
        }

        val image201:String = intent.getStringExtra("image")
        if(image=="m1"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin1)
        }

        val image202:String = intent.getStringExtra("image")
        if(image=="m2"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin2)
        }

        val image203:String = intent.getStringExtra("image")
        if(image=="m3"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin3)
        }

        val image204:String = intent.getStringExtra("image")
        if(image=="m4"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin4)
        }

        val image205:String = intent.getStringExtra("image")
        if(image=="m5"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin5)
        }

        val image206:String = intent.getStringExtra("image")
        if(image=="m6"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin6)
        }

        val image207:String = intent.getStringExtra("image")
        if(image=="m7"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin7)
        }

        val image208:String = intent.getStringExtra("image")
        if(image=="m8"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin8)
        }

        val image209:String = intent.getStringExtra("image")
        if(image=="m9"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin9)
        }

        val image210:String = intent.getStringExtra("image")
        if(image=="m10"){
            val image:ImageView = findViewById(R.id.imagem)
            image.setImageResource(R.drawable.pin10)
        }

    }
}
