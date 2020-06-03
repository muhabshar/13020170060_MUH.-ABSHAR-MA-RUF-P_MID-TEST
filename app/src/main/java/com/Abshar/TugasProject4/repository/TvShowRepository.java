package com.Abshar.TugasProject4.repository;

import com.Abshar.TugasProject4.model.CastCrew;
import com.Abshar.TugasProject4.model.TvShow;

import java.util.ArrayList;
import java.util.List;

public class TvShowRepository {

    private static TvShowRepository instance;
    private List<TvShow> list = new ArrayList<>();

    public static TvShowRepository getInstance() {
        if (instance == null) {
            instance = new TvShowRepository();
        }

        return instance;
    }

    public List<CastCrew> getCherno(){
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/mGODbYpkR1NKBOV3rtTfZ7EWoIl.jpg",
                "Jared Harris"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/wCpWjalD8d4MNuAdYupYf3viT1I.jpg",
                "Stellan Skarsgård"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/oJerQ7xq5uLTsxjqGWzsbYCjobh.jpg",
                "Emily Watson"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/pCUnyy7AkjklP0qHc1egmu9u33Q.jpg",
                "Paul Ritter"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/suPlvXS2HBGlWhb3RbtLeUh62T.jpg",
                "Jessie Buckley"));
        return al;
    }
    public List<CastCrew> getGob(){
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/cm4csWdIzLzLLY0slynfk1B71QF.jpg",
                "Gong Yoo"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/xUac1raj5aGvasQWPdHImeQIf58.jpg",
                "Kim Go-eun"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/v2c9zgY39CG43OFQjx7AxR2DzZ3.jpg",
                "Lee Dong-wook"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w600_and_h900_bestv2/zkw2hJv40No9ugqzr818e1Y8iDL.jpg",
                "You In-na"));
        al.add(new CastCrew("https://www.themoviedb.org/person/1398345-yook-sungjae?language=en-US",
                "Yook Sung-jae"));
        return al;
    }
    public List<CastCrew> getCH(){
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/140120_Minho_Lee_c.jpg/330px-140120_Minho_Lee_c.jpg",
                "Lee Min-ho"));
        al.add(new CastCrew("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/190905_%EB%B0%95%EB%AF%BC%EC%98%81.jpg/330px-190905_%EB%B0%95%EB%AF%BC%EC%98%81.jpg",
                "Park Min-young"));
        al.add(new CastCrew("https://upload.wikimedia.org/wikipedia/commons/f/f2/190701_tvN_%EB%93%9C%EB%9D%BC%EB%A7%88_%2760%EC%9D%BC%2C%EC%A7%80%EC%A0%95%EC%83%9D%EC%A1%B4%EC%9E%90%27_%EC%A0%9C%EC%9E%91%EB%B0%9C%ED%91%9C%ED%9A%8C_%EC%9D%B4%EC%A4%80%ED%98%81.jpg",
                "Lee Joon-hyuk"));
        al.add(new CastCrew("https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Kim_Sang-jong_in_2017.jpg/330px-Kim_Sang-jong_in_2017.jpg",
                "Kim Sang-joongr"));
        al.add(new CastCrew("http://asianwiki.com/images/0/08/Hwang_Sun-Hee-p1.jpg",
                "Hwang Sun-hee"));
        return al;
    }
    public List<CastCrew> getSpaceForce2020(){
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/dzJtsLspH5Bf8Tvw7OQC47ETNfJ.jpg", "Steve Carrel"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/5coH0AExljEnbseCXKL4CDOVQj8.jpg", "John Malkovich"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/5vV52TSEIhe4ZZLWwv3i7nfv8we.jpg", "Ben Schwartz"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/mCnhiPv7LJOzy5VEnEJewpc339D.jpg", "Diana Silvers"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/pMZ5cB05M6UGtU4I5xI0tpMYXka.jpg", "Tawny Newsome"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/wI0nTOwKDDahBBuW4RjDKiw9jZX.jpg", "Alexey Vorobyov"));
        return al;
    }
    public List<CastCrew> getRickMorty2013(){
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/wYApP38aXe6ZcEtlBAfNRxJTQQi.jpg", "Justin Roiland"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/aGzA5l9S89qLkhpSdjmkerFdZt0.jpg", "Chris Parnell"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/ycwiu89cpjqCtSNC5FjbJggjj5R.jpg", "Sarah Chalke"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/4hPvsVP7uDBHDgj7JikIY3Wop18.jpg", "Brandon Johson"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/9phhl0oubAKt8D50xLGAb81KPSb.jpg", "Karie Wahlgren"));
        return al;
    }
    public List<CastCrew> getThe100(){
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/igWylWFncQPoJZcmwRsACUYXtyQ.jpg", "Eliza Taylor"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/2cmGyuIhI8pGe1W3mGXK1RtQIeK.jpg", "Bob Morley"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/m5vWJx7LCiJ1ZBoAYJBqKrK4khL.jpg", "Marie Avgeropoulos"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/azTNRQ6VsxWNCwwvbPQu2JRvVCA.jpg", "Lindsey Morgan"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/kYc2nCBBU9pHNDMDopk6WIVXZg6.jpg", "Richard Harmon"));
        return al;
    }
    public List<CastCrew> getTheSimpson1989(){
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/AmeqWhP4A46AWkM4kVphg6jOTQX.jpg", "Dan Castellaneta"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/x3oG3OXtBfTFgqXPqxI1GKVEiaQ.jpg", "Julie Kavner"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/40qNhyYJhSE2Yiy4pnXSZhdufO6.jpg", "Nancy Cartwright"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/9AjPwbb3uz4GfgOPBYsy2ILvwkB.jpg", "Yeardley Smith"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/9AjPwbb3uz4GfgOPBYsy2ILvwkB.jpg", "Hank Azaria"));
        return al;
    }
    public List<CastCrew> getSupernatural2005(){
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/xNnXTeRG3JyoiYQznwPm8Y3pZfl.jpg", "Jensen Ackles"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/c2ARidmx8gxqIVno0W6LSq77v7U.jpg", "Jared Padalecki"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/c3Cqp1XAdcyeUZKkcrdQsPwb010.jpg", "Jim Beaver"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/s96LOznSIECurv7obBSQihbvK8.jpg", "Ruth Connell"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/eK6wzFnDl4XEIXGboyrgaCCNqqV.jpg", "Misha Collins"));
        return al;
    }
    public List<CastCrew> getSnowPiercer2020(){
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/mOVleZFCqMDugAXyyiJBq6LmSah.jpg", "Jennifer Connelly"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/codalhZzB4LvJTSGOnOyrTEsqsF.jpg", "Daveed Diggs"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/gNxtYfg8xXgeQ4YC7Pl3HNRAjol.jpg", "Mickey Sumner"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/lwetyIzRTIOvxdHecVxyZIoRBAT.jpg", "Susan Park"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/9PKwxJfYOgxAkZurTTY17EdIPGY.jpg", "Benjamin Haigh"));
        return al;
    }
    public List<CastCrew> getBreakingBad2008(){
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/aGSvZg7uITJveQtGHDcPNI6map1.jpg", "Bryan Cranston"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/u8UdsB9yenM4uHEjmce4nkBn48X.jpg", "Aaron Paul"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/adppyeu1a4REN3khtgmXusrapFi.jpg", "Anna Gunn"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/yV3DZ52LYRf5F605xRas5BEcJrZ.jpg", "Dean Norris"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/zmhhPmXnwjSzVyoTVL93i1EkLRK.jpg", "Betsy Brandt"));
        return al;
    }
       public List<CastCrew> getArrow2012() {
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/h7KpOs3NlcquoJnZBFMOad81XEZ.jpg", "Stephen Amell"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/bZWO7WfBYI8iojTFozzqN2X3RWL.jpg", "David Ramsey"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/zJpZjePZTI76ncqY2bA6Yzf86FP.jpg", "Katie Cassidy"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/ESdQPJqew87SrBMKtKrN8Z7EJ5.jpg", "Willa Holland"));
        al.add(new CastCrew("https://image.tmdb.org/t/p/w138_and_h175_face/3OC1M0rKJO8B3JpwAeavk5EAscl.jpg", "Paul Blackthorne"));
        return al;
    }


    public List<CastCrew> getTG() {
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/1/14785.jpg",
                "Kobori, Yurie"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/3/54663.jpg",
                "Amamiya, Sora"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/54599.jpg",
                "Kugimiya, Rie"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/42157.jpg",
                "Sakurai, Takahiro"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/1/42141.jpg",
                "Miyano, Mamoru"));
        return al;
    }
    public List<CastCrew> getSnK() {
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/1/53725.jpg",
                "Ishikawa, Yui"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/54595.jpg",
                "Kaji, Yuki"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/3/42668.jpg",
                "Inoue, Marina"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/1/58597.jpg",
                "Kamiya, Hiroshi"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/1/54593.jpg",
                "Ono, Daisuke"));
        return al;
    }
    public List<CastCrew> getFullmetal() {
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/1/54602.jpg",
                "Park, Romi"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/54599.jpg",
                "Kugimiya, Rie"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/3/54678.jpg",
                "Miki, Shinichiro"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/3/57226.jpg",
                "Fujiwara, Keiji"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/42161.jpg",
                "Nakamura, Yuuichi"));
        return al;
    }
    public List<CastCrew> getSAO() {
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/40132.jpg",
                "Matsuoka, Yoshitsugu"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/54591.jpg",
                "Tomatsu, Haruka"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/1/54669.jpg",
                "Taketatsu, Ayana"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/34681.jpg",
                "Itou, Kanae"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/41540.jpg",
                "Hidaka, Rina"));
        return al;
    }
    public List<CastCrew> getToG() {
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/48785.jpg",
                "Okamoto, Nobuhiko"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/1/47931.jpg",
                "Ichikawa, Taichi"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/1/42617.jpg",
                "Miyake, Kenta"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/55658.jpg",
                "Hayami, Saori"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/26787.jpg",
                "Suegara, Rie"));
        return al;
    }
    public List<CastCrew> getGlpr() {
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/3/58598.jpg",
                "Hanae, Natsuki"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/3/54282.jpg",
                "Touyama, Nao"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/1/54490.jpg",
                "Ichinose, Kana"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/3/57913.jpg",
                "Hanazawa, Kana"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/58504.jpg",
                "Itou, Miku"));
        return al;
    }
    public List<CastCrew> getDN() {
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/54676.jpg",
                "Yamaguchi, Kappe"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/1/42141.jpg",
                "Miyano, Mamoru"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/3/12269.jpg",
                "Nakamura, Shidou"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/1/53079.jpg",
                "Hidaka, Noriko"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/3/42166.jpg",
                "Hirano, Aya"));
        return al;
    }
    public List<CastCrew> getOPM() {
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/1/41311.jpg",
                "Furukawa, Makoto"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/1/57127.jpg",
                "Ishikawa, Kaito"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/50769.jpg",
                "Yuuki, Ao"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/42161.jpg",
                "Nakamura, Yuuichi"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/54595.jpg",
                "Kaji, Yuki"));
        return al;
    }
    public List<CastCrew> getYwU(){
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/3/57913.jpg",
                "Hanazawa, Kana"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/54400.jpg",
                "Miyamoto, Yume"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/3/53837.jpg",
                "Kobayashi, Chikahiro"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/3/56752.jpg",
                "Kitamura, Eri"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/3/58598.jpg",
                "Hanae, Natsuk"));
        return al;
    }
    public List<CastCrew> getSwKnU() {
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/1/46264.jpg",
                "Taneda, Risa"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/3/58598.jpg",
                "Hanae, Natsuki"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/59419.jpg",
                "Sakura, Ayane"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/3/57323.jpg",
                "Osaka, Ryota"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/55658.jpg",
                "Hayami, Saori"));
        return al;
    }
    public List<CastCrew> getVE() {
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/1/53725.jpg",
                "Ishikawa, Yui"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/3/54499.jpg",
                "Namikawa, Daisuke"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/48877.jpgg",
                "Uchiyama, Kouki"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/2/29479.jpg",
                "Tadokoro, Azusa"));
        al.add(new CastCrew("https://cdn.myanimelist.net/images/voiceactors/3/10132.jpg",
                "Endou, Aya"));
        return al;
    }
    public List<CastCrew> getGmh() {
        List<CastCrew> al = new ArrayList<>();
        al.add(new CastCrew("https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Shin_Min-a_LG_%EC%98%B5%ED%8B%B0%EB%A8%B8%EC%8A%A4_3D_%26_LG_%EC%8B%9C%EB%84%A4%EB%A7%88_3D_TV_CF_%EC%B4%AC%EC%98%81_%EC%82%AC%EC%A7%84.jpg/662px-Shin_Min-a_LG_%EC%98%B5%ED%8B%B0%EB%A8%B8%EC%8A%A4_3D_%26_LG_%EC%8B%9C%EB%84%A4%EB%A7%88_3D_TV_CF_%EC%B4%AC%EC%98%81_%EC%82%AC%EC%A7%84.jpg",
                "Shin Min-a"));
        al.add(new CastCrew("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1f/190105_%EC%9D%B4%EC%8A%B9%EA%B8%B0.png/600px-190105_%EC%9D%B4%EC%8A%B9%EA%B8%B0.png",
                "Lee Seung-gi"));
        al.add(new CastCrew("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/140210-%EC%97%B0%EC%95%A0%EC%A7%95%ED%81%AC%EC%8A%A4-vip%EC%8B%9C%EC%82%AC%ED%9A%8C%EB%85%B8%EB%AF%BC%EC%9A%B0.jpg/330px-140210-%EC%97%B0%EC%95%A0%EC%A7%95%ED%81%AC%EC%8A%A4-vip%EC%8B%9C%EC%82%AC%ED%9A%8C%EB%85%B8%EB%AF%BC%EC%9A%B0.jpg",
                "No Min-woo"));
        al.add(new CastCrew("https://upload.wikimedia.org/wikipedia/commons/2/28/ParkShinHye09122018.jpg",
                "Park Shin-hye"));
        al.add(new CastCrew("https://upload.wikimedia.org/wikipedia/commons/6/66/Park_Soo-jin_at_the_2014_Seoul_Fashion_Week.JPG",
                "Park Soo-jin"));
        return al;
    }


    public List<TvShow> getData(){
        list.add(new TvShow("https://m.media-amazon.com/images/M/MV5BMjhiMzgxZTctNDc1Ni00OTIxLTlhMTYtZTA3ZWFkODRkNmE2XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SY1000_CR0,0,718,1000_AL_.jpg",
                "Breaking Bad",
                "When Walter White, a New Mexico chemistry teacher, is diagnosed with Stage III cancer and given a prognosis of only two years left to live. He becomes filled with a sense of fearlessness and an unrelenting desire to secure his family's financial future at any cost as he enters the dangerous world of drugs and crime. ",
                "Drama",
                "44m",
                "Vince Gilligan",
                "2007",getBreakingBad2008()));
        list.add(new TvShow("https://image.tmdb.org/t/p/w600_and_h900_bestv2/hlLXt2tOPT6RRnjiUmoxyG1LTFi.jpg",
                "Chernobyl",
                "The true story of one of the worst man-made catastrophes in history: the catastrophic nuclear accident at Chernobyl. A tale of the brave men and women who sacrificed to save Europe from unimaginable disaster.",
                "Drama",
                "1h 10m. per ep.",
                "Craig Mazin",
                "2019", getCherno()));
        list.add(new TvShow("https://upload.wikimedia.org/wikipedia/en/3/39/City-hunter-poster-2.jpg",
                "City Hunter",
                "In 1983, the South Korean president and his delegates are visiting Burma when a bomb planted by North Korean agents explodes, killing some high-ranking officials. This historical event is called the Rangoon bombing (also known as the Rangoon incident). To strike back, five South Korean officials plan a covert operation, codenamed \"Operation Cleansweep\", to enter North Korea and kill several top members of the North's high command. Lee Jin-pyo (Kim Sang-joong) and Park Moo-yeol (Park Sang-min), two Presidential Security Service bodyguards and best friends who were present at the bombing, organize a 21-man team for the mission. However, as the team wreaks havoc in Pyongyang, the five officials abort the plan to avoid an international crisis if the mission is discovered. Their major concern is that the United States will withdraw its nuclear protection if the mission is made public, in light of Seoul's official declaration that it will not retaliate.",
                "Action, Thriller, Romance",
                "1h 10m. per ep.",
                "Jin Hyuk",
                "2011", getCH()));
        list.add(new TvShow("https://cdn.myanimelist.net/images/anime/9/9453.jpg",
                "Death Note",
                "A shinigami, as a god of death, can kill any person—provided they see their victim's face and write their victim's name in a notebook called a Death Note. One day, Ryuk, bored by the shinigami lifestyle and interested in seeing how a human would use a Death Note, drops one into the human realm.\n" +
                        "\n" +
                        "High school student and prodigy Light Yagami stumbles upon the Death Note and—since he deplores the state of the world—tests the deadly notebook by writing a criminal's name in it. When the criminal dies immediately following his experiment with the Death Note, Light is greatly surprised and quickly recognizes how devastating the power that has fallen into his hands could be.\n" +
                        "\n" +
                        "With this divine capability, Light decides to extinguish all criminals in order to build a new world where crime does not exist and people worship him as a god. Police, however, quickly discover that a serial killer is targeting criminals and, consequently, try to apprehend the culprit. To do this, the Japanese investigators count on the assistance of the best detective in the world: a young and eccentric man known only by the name of L.\n",
                "Mystery, Police, Psychological, Supernatural, Thriller, Shounen",
                "23 min. per ep.",
                "Araki Tetsurou",
                "2006", getDN()));
        list.add(new TvShow("https://cdn.myanimelist.net/images/anime/1223/96541.jpg",
                "Fullmetal Alchemist: Brotherhood",
                "\"In order for something to be obtained, something of equal value must be lost.\"\n" +
                        "\n" +
                        "Alchemy is bound by this Law of Equivalent Exchange—something the young brothers Edward and Alphonse Elric only realize after attempting human transmutation: the one forbidden act of alchemy. They pay a terrible price for their transgression—Edward loses his left leg, Alphonse his physical body. It is only by the desperate sacrifice of Edward's right arm that he is able to affix Alphonse's soul to a suit of armor. Devastated and alone, it is the hope that they would both eventually return to their original bodies that gives Edward the inspiration to obtain metal limbs called \"automail\" and become a state alchemist, the Fullmetal Alchemist.\n" +
                        "\n" +
                        "Three years of searching later, the brothers seek the Philosopher's Stone, a mythical relic that allows an alchemist to overcome the Law of Equivalent Exchange. Even with military allies Colonel Roy Mustang, Lieutenant Riza Hawkeye, and Lieutenant Colonel Maes Hughes on their side, the brothers find themselves caught up in a nationwide conspiracy that leads them not only to the true nature of the elusive Philosopher's Stone, but their country's murky history as well. In between finding a serial killer and racing against time, Edward and Alphonse must ask themselves if what they are doing will make them human again... or take away their humanity.",
                "Action, Military, Adventure, Comedy, Drama, Magic, Fantasy, Shounen",
                " 24 min. per ep.",
                "Irie Yasuhiro",
                "2009", getFullmetal()));
        list.add(new TvShow("https://cdn.myanimelist.net/images/anime/1380/106565.jpg",
                "Gleipnir",
                "What does one consider to be a monster? A horrible bloodsucking vampire? Frankenstein's creation? Shuichi Kagaya has a secret. Other than having great grades and being skilled at sports, he isn’t what one would call normal. In fact, Shuichi cannot even be considered human.\n" +
                        "\n" +
                        "One fateful morning, he woke up as a monster. With brute strength, an abnormally strong sense of smell, big fluffy paws, and the depression and self-hate that comes after losing one's humanity, his life was suddenly flipped upside down. Claire Aoki, the girl he had decided to save, now holds his secret over his head. Claire is a sadistic and utterly twisted girl, with no sense of empathy toward the lives of others. Before meeting Shuichi, she was in the search of monsters, hoping to find her monster sister. Despite becoming a monster, Shuichi naively continues to hold onto his human morals, but how long can one last in this insufferable way of living?.",
                "Action, Mystery, Supernatural, Ecchi, Seinen",
                "23 min. per ep.",
                "Yoneda Kazuhiro",
                "2020", getGlpr()));
        list.add(new TvShow("https://image.tmdb.org/t/p/w600_and_h900_bestv2/76EsqOwwfmJ0qRBJzrC1C8VgoJc.jpg",
                "Goblin",
                "Kim Shin is an immortal “goblin,” and has the rather honorable title of being the Protector of Souls. His roommate Wang Yeo also happens to have the equally lofty, if thoroughly opposing, title of Angel of Death, and he acts as the storied grim reaper that claims souls. However, both these devilishly handsome angels have a problem: Wang Yeo has amnesia and Kim Shin wants to end his own (immortal) life. Unfortunately for goblins, the only way to defeat immortality is to marry a human bride. For that purpose, Kim Shin decides to win over Ji Eun Tak an optimistic high school girl who he thinks will be the priestess that ends his cursed existence. Now, once responsible for protecting souls and watching them pass, Kim Shin now tries to send his own to the afterlife. But when a slightly complicated method of suicide starts turning into true love, will our immortal goblin begin to regret his decision--where acting on that very love ultimately means the end of his life?",
                " Drama, Sci-Fi & Fantasy",
                "1h 30m. per ep.",
                 "Kim Eun-sook, Lee Eung-bok",
                "2016", getGob()));
        list.add(new TvShow("https://cdn.myanimelist.net/images/anime/1702/106229.jpg",
                "Kami No Tou",
                "There is a tower that summons chosen people called \"Regulars\" with the promise of granting their deepest desires. Whether it be wealth, fame, authority, or something that surpasses them all—everything awaits those who reach the top.\n" +
                        "\n" +
                        "Twenty-Fifth Bam is a boy who had only known a dark cave, a dirty cloth, and an unreachable light his entire life. So when a girl named Rachel came to him through the light, his entire world changed. Becoming close friends with Rachel, he learned various things about the outside world from her. But when Rachel says she must leave him to climb the Tower, his world shatters around him. Vowing to follow after her no matter what it takes, he sets his sight on the tower, and a miracle occurs.\n" +
                        "\n" +
                        "Thus begins the journey of Bam, a young boy who was not chosen by the Tower but opened its gates by himself. They call his kind \"Irregulars\"—beings that have shaken the very foundation of the Tower each time they set foot inside it." ,
                "Action, Adventure, Drama, Fantasy, Mystery",
                "23 min. per ep.",
                "Sano Takashi",
                "2020", getToG()));
        list.add(new TvShow("https://i.pinimg.com/736x/4e/09/81/4e0981bf12357e42be648e97b637cf24.jpg",
                "My Girlfriend Is a Gu Mi-ho",
                "Cha Dae-woong (Lee Seung-Gi) is a normal college student, with ambitions of becoming an action star. Until one day, he accidentally releases a gumiho (Shin Min-ah), a legendary fox with nine tails who was sealed inside a painting by Samshin Grandmother (三神). Fleeing the scene, Dae-woong suffers a life-threatening fall and is only saved by the gumiho giving him her \"fox bead\" (여우 구슬). When Dae-woong awakes and meets a mysterious and very beautiful girl, he initially treats her as eccentric or mentally ill, before finally understanding that she is a gumiho in human form. According to myth, gumihos eat men's livers, so Dae-woong is scared out of his wits, and the gumiho takes advantage of his fear by sticking by his side. He names her \"Mi-ho,\" and keeps her happy by buying her beef and hiding her true identity. Mi-ho wants nothing more than to become human, so they strike a deal: she'll lend him her mystical fox bead so that with his increased speed and strength, he'll be able to do difficult stunts, and in exchange he'll help her become human. As time passes, they get to know each other better and Dae-woong is charmed by how Mi-ho looks at the world with childlike wonder. ",
                "Romance, Comedy, Fantasy",
                "1h. per ep.",
                "Boo Sung-chul",
                "2010", getGmh()));
        list.add(new TvShow("https://cdn.myanimelist.net/images/anime/12/76049.jpg",
                "One Punch Man",
                "The seemingly ordinary and unimpressive Saitama has a rather unique hobby: being a hero. In order to pursue his childhood dream, he trained relentlessly for three years—and lost all of his hair in the process. Now, Saitama is incredibly powerful, so much so that no enemy is able to defeat him in battle. In fact, all it takes to defeat evildoers with just one punch has led to an unexpected problem—he is no longer able to enjoy the thrill of battling and has become quite bored.\n" +
                        "\n" +
                        "This all changes with the arrival of Genos, a 19-year-old cyborg, who wishes to be Saitama's disciple after seeing what he is capable of. Genos proposes that the two join the Hero Association in order to become certified heroes that will be recognized for their positive contributions to society, and Saitama, shocked that no one knows who he is, quickly agrees. And thus begins the story of One Punch Man, an action-comedy that follows an eccentric individual who longs to fight strong enemies that can hopefully give him the excitement he once felt and just maybe, he'll become popular in the process.",
                "Action, Sci-Fi, Comedy, Parody, Super Power, Supernatural",
                "24 min. per ep.",
                "Natsume, Shingo",
                "2015", getOPM()));
        list.add(new TvShow("https://image.tmdb.org/t/p/w220_and_h330_face/8kOWDBK6XlPUzckuHDo3wwVRFwt.jpg",
                "Rick and Morty",
                "Rick is a mentally-unbalanced but scientifically-gifted old man who has recently reconnected with his family. He spends most of his time involving his young grandson Morty in dangerous, outlandish adventures throughout space and alternate universes. Compounded with Morty's already unstable family life, these events cause Morty much distress at home and school.",
                "Animation, Comedy, Sci-Fi & Fantasy, Action & Adventure",
                "22m",
                "Dan Harmon,Justin Roiland",
                "2013", getRickMorty2013()));
        list.add(new TvShow("https://image.tmdb.org/t/p/w220_and_h330_face/zgu3p4NvisS8CI68cUfBKbvAvu8.jpg",
                "Space Force",
                "A four-star general begrudgingly teams up with an eccentric scientist to get the U.S. military's newest agency — Space Force — ready for lift-off.",
                "Comedy",
                "30m",
                "Steve Carrel",
                "2020", getSpaceForce2020()));
        list.add(new TvShow(
                "https://image.tmdb.org/t/p/w220_and_h330_face/KoYWXbnYuS3b0GyQPkbuexlVK9.jpg",
                "Supernatural",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way. ",
                "Drama, Mystery, Sci-Fi & Fantasy",
                "45m",
                "Eric Kripke",
                "2005",getSupernatural2005()));
        list.add(new TvShow(
                "https://image.tmdb.org/t/p/w220_and_h330_face/n6UNHZoiYj81abwmG38HbNjflDx.jpg",
                "Snowpiercer",
                "Set more than seven years after the world has become a frozen wasteland, the remnants of humanity inhabit a gigantic, perpetually-moving train that circles the globe as class warfare, social injustice and the politics of survival play out. ",
                "Sci-Fi & Fantasy",
                "50m",
                "Graeme Manson",
                "2020",getSnowPiercer2020()));
        list.add(new TvShow("https://cdn.myanimelist.net/images/anime/10/47347.jpg",
                "Shingeki No Kyoujin",
                "Centuries ago, mankind was slaughtered to near extinction by monstrous humanoid creatures called titans, forcing humans to hide in fear behind enormous concentric walls. What makes these giants truly terrifying is that their taste for human flesh is not born out of hunger but what appears to be out of pleasure. To ensure their survival, the remnants of humanity began living within defensive barriers, resulting in one hundred years without a single titan encounter. However, that fragile calm is soon shattered when a colossal titan manages to breach the supposedly impregnable outer wall, reigniting the fight for survival against the man-eating abominations.\n" +
                        "\n" +
                        "After witnessing a horrific personal loss at the hands of the invading creatures, Eren Yeager dedicates his life to their eradication by enlisting into the Survey Corps, an elite military unit that combats the merciless humanoids outside the protection of the walls. Based on Hajime Isayama's award-winning manga, Shingeki no Kyojin follows Eren, along with his adopted sister Mikasa Ackerman and his childhood friend Armin Arlert, as they join the brutal war against the titans and race to discover a way of defeating them before the last walls are breached.\n",
                "Action, Military, Mystery, Super Power, Drama, Fantasy, Shounen",
                "24 min. per ep.",
                "Araki Tetsurou",
                "2013", getSnK()));
        list.add(new TvShow("https://cdn.myanimelist.net/images/anime/3/67177.jpg",
                "Shigatsu wa Kimi no Uso",
                "Music accompanies the path of the human metronome, the prodigious pianist Kousei Arima. But after the passing of his mother, Saki Arima, Kousei falls into a downward spiral, rendering him unable to hear the sound of his own piano.\n" +
                        "\n" +
                        "Two years later, Kousei still avoids the piano, leaving behind his admirers and rivals, and lives a colorless life alongside his friends Tsubaki Sawabe and Ryouta Watari. However, everything changes when he meets a beautiful violinist, Kaori Miyazono, who stirs up his world and sets him on a journey to face music again.\n" +
                        "\n" +
                        "Based on the manga series of the same name, Shigatsu wa Kimi no Uso approaches the story of Kousei's recovery as he discovers that music is more than playing each note perfectly, and a single melody can bring in the fresh spring air of April.\n",
                "Drama, Music, Romance, School, Shounen",
                "21 min. per ep.",
                "Ishiguro, Kyohei",
                "2013", getSwKnU()));
        list.add(new TvShow("https://cdn.myanimelist.net/images/anime/11/39717.jpg",
                "Sword Art Online",
                "In the year 2022, virtual reality has progressed by leaps and bounds, and a massive online role-playing game called Sword Art Online (SAO) is launched. With the aid of \"NerveGear\" technology, players can control their avatars within the game using nothing but their own thoughts.\n" +
                        "\n" +
                        "Kazuto Kirigaya, nicknamed \"Kirito,\" is among the lucky few enthusiasts who get their hands on the first shipment of the game. He logs in to find himself, with ten-thousand others, in the scenic and elaborate world of Aincrad, one full of fantastic medieval weapons and gruesome monsters. However, in a cruel turn of events, the players soon realize they cannot log out; the game's creator has trapped them in his new world until they complete all one hundred levels of the game.\n" +
                        "\n" +
                        "In order to escape Aincrad, Kirito will now have to interact and cooperate with his fellow players. Some are allies, while others are foes, like Asuna Yuuki, who commands the leading group attempting to escape from the ruthless game. To make matters worse, Sword Art Online is not all fun and games: if they die in Aincrad, they die in real life. Kirito must adapt to his new reality, fight for his survival, and hopefully break free from his virtual hell.\n",
                "Action, Adventure, Fantasy, Game, Romance",
                "23 min. per ep.",
                "Itou Tomohiko",
                "2012", getSAO()));
        list.add(new TvShow("https://image.tmdb.org/t/p/w220_and_h330_face/wcaDIAG1QdXQLRaj4vC1EFdBT2.jpg",
                "The 100",
                "100 years in the future, when the Earth has been abandoned due to radioactivity, the last surviving humans live on an ark orbiting the planet — but the ark won't last forever. So the repressive regime picks 100 expendable juvenile delinquents to send down to Earth to see if the planet is still habitable.",
                "ci-Fi & Fantasy, Drama, Action & Adventure",
                "43m",
                "Jason Rothenberg",
                "2014", getThe100()));
        list.add(new TvShow(
                "https://image.tmdb.org/t/p/w220_and_h330_face/qcr9bBY6MVeLzriKCmJOv1562uY.jpg",
                "The Simpson",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                "Animation, Comedy",
                "22m","Matt Groening",
                "1989",getTheSimpson1989()));
        list.add(new TvShow("https://cdn.myanimelist.net/images/anime/5/64449.jpg",
                "Tokyo Ghoul",
                "Tokyo has become a cruel and merciless city—a place where vicious creatures called “ghouls” exist alongside humans. The citizens of this once great metropolis live in constant fear of these bloodthirsty savages and their thirst for human flesh. However, the greatest threat these ghouls pose is their dangerous ability to masquerade as humans and blend in with society.\n" +
                        "\n" +
                        "Based on the best-selling supernatural horror manga by Sui Ishida, Tokyo Ghoul follows Ken Kaneki, a shy, bookish college student, who is instantly drawn to Rize Kamishiro, an avid reader like himself. However, Rize is not exactly who she seems, and this unfortunate meeting pushes Kaneki into the dark depths of the ghouls' inhuman world. In a twist of fate, Kaneki is saved by the enigmatic waitress Touka Kirishima, and thus begins his new, secret life as a half-ghoul/half-human who must find a way to integrate into both societies.",
                "Action, Mystery, Horror, Psychological, Supernatural, Drama, Seinen",
                " 24 min. per ep.",
                "Morita Shuuhei",
                "2014", getTG()));
        list.add(new TvShow("https://cdn.myanimelist.net/images/anime/1986/105547.jpg",
                "Yesterday Wo Utatte",
                "After college, Rikuo Uozumi, a boy without much ambition in life, takes on a job at a convenience store. The days pass by uneventfully for Rikuo until he meets his former girlfriend and classmate, but especially thanks to the unusual Haru Nonaka, and her pet crow...",
                "Slice of Life, Drama, Romance, Seinen",
                "23 min. per ep.",
                "Fujiwara, Yoshiyuki",
                "2020", getYwU()));
        list.add(new TvShow("https://cdn.myanimelist.net/images/anime/1795/95088l.jpg",
                "Violet Evergarden",
                "The Great War finally came to an end after four long years of conflict; fractured in two, the continent of Telesis slowly began to flourish once again. Caught up in the bloodshed was Violet Evergarden, a young girl raised for the sole purpose of decimating enemy lines. Hospitalized and maimed in a bloody skirmish during the War's final leg, she was left with only words from the person she held dearest, but with no understanding of their meaning.\n" +
                        "\n" +
                        "Recovering from her wounds, Violet starts a new life working at CH Postal Services after a falling out with her new intended guardian family. There, she witnesses by pure chance the work of an \"Auto Memory Doll,\" amanuenses that transcribe people's thoughts and feelings into words on paper. Moved by the notion, Violet begins work as an Auto Memory Doll, a trade that will take her on an adventure, one that will reshape the lives of her clients and hopefully lead to self-discovery.",
                "Slice of Life, Drama, Fantasy",
                "24 min. per ep.",
                "Ishidate Taichi",
                "2018", getVE()));
        return list;
    }

    public void removeIndex(int index){
        list.remove(index);
    }

    public void clearData(){
        list.clear();
    }
}
