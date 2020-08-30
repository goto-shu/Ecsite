package jp.co.internous.ecsite.model.entity;

//TODO　Entity宣言/カラムに対応したフィールドの設定/ゲッターセッター

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="goods")
public class Goods {
	
	//DBへのアクセスのためにフィールドを設定
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="goods_name")
	private String goodsName;
	
	@Column(name="price")
	private long price;
	
	@Column(name="updated_at")
	private Timestamp updatedAt;
	
	
	//DBテーブルのカラムに対応する値を取得するためにゲッター/セッターを記述
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public long getPrice() {
		return price;
	}
	
	public void setPrice(long price) {
		this.price = price;
	}
	
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
}
