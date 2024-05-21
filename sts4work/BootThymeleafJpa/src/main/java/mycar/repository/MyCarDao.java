package mycar.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import mycar.data.MyCarDto;

@Repository
@AllArgsConstructor
public class MyCarDao {

	MyCarDaoInter daoInter;
	
	//db저장
	public void insertMyCar(MyCarDto dto) {
		daoInter.save(dto);
	}
	
	//전체 출력
	public List<MyCarDto> getAllCars()
	{
//		return daoInter.findAll();
		return daoInter.findAll(Sort.by(Sort.Direction.DESC, "carprice"));  //가격 비싼것부터 출력
		
	}
	
	public MyCarDto getData(Long num)
	{
		return daoInter.getReferenceById(num);
	}
	
	public void deleteMyCar(Long num)
	{
		daoInter.deleteById(num);
	}
	
	public void updateMyCar(MyCarDto dto)
	{
		daoInter.save(dto);
	}
}
