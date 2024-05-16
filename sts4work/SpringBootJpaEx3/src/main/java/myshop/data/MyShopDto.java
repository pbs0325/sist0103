package myshop.data;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="myshop") //자동으로 myshop table이 mysql에 만들어진다,같은 이름의 테이블이 존재하는경우에 덮어씌운다.
public class MyShopDto {
	
	@Id //각 entity를 구별할 수 있는 식별자(시퀀스) 역할이다.
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long num;
	
	@Column(name="sangname")
	private String sangname;
	
	@Column //이름이 같으면 생략가능
	private String sangprice;
	
	@Column
	private String sangcolor;
	
	@Column
	private String sangipgo;
	
	@CreationTimestamp //entity 생성시점의 시간 자동등록
	private Timestamp writeday;
	
}
